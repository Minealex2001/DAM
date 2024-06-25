import entities.Actor;
import entities.Pelicula;
import entities.PeliculaOscarizada;
import utils.Utilidades;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilidadesTest {

    @Test
    public void testActoresConMasDeUnOscar() {
        List<PeliculaOscarizada> peliculaOscarizadas = new ArrayList<>();
        peliculaOscarizadas.add(new PeliculaOscarizada(1933, 26, "Katharine Hepburn", "F", "Morning Glory"));
        peliculaOscarizadas.add(new PeliculaOscarizada(1967, 29, "Katharine Hepburn", "F", "Guess Who's Coming to Dinner"));
        peliculaOscarizadas.add(new PeliculaOscarizada(1968, 30, "Alfonso", "H", "The Lion in Winter"));
        List<Actor> actores = peliculaOscarizadas.stream().map(p -> new Actor(p.getActor(), p.getSexo(), p.getAnyo(), peliculaOscarizadas.stream().filter(p2 -> p2.getActor().equals(p.getActor())).map(p2 -> new Pelicula(p2.getPelicula(), p2.getAnyo())).collect(toList()))).distinct().collect(toList());
        actores.stream().filter(a -> peliculaOscarizadas.stream().filter(p -> p.getActor().equals(a.getNombre())).count() > 1).map(Actor::getNombre).collect(toList());
        assertAll(
                () -> assertEquals(3, actores.size()),
                () -> assertEquals("Katharine Hepburn", actores.get(0).getNombre())
        );
    }

}

