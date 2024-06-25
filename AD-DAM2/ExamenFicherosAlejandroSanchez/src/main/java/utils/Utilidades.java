package utils;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import entities.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;
import static java.util.stream.Collectors.toList;

public class Utilidades {

    List<PeliculaOscarizada> listaPeliculasOscarizadas = new ArrayList<>();
    List<Actor> listaActores = new ArrayList<>();


    // Métodos a implementar:

    // 1. leerPeliculasOscarizadasCsv: lee un fichero CSV y devuelve una lista de objetos PeliculaOscarizada.
    //                                 Debe tener en cuenta también el parámetro sexo para filtrar por sexo.

    public Utilidades() throws IOException {
        final String COMMA_DELIMITER = ";";
        try(Stream<String> contenidoCSVM = lines(Path.of("src/main/resources/oscar_age_female.csv")); Stream<String> contenidoCSVH = lines(Path.of("src/main/resources/oscar_age_male.csv"))){

            contenidoCSVM.map(l -> Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l -> new PeliculaOscarizada(Integer.parseInt(l.get(1)), Integer.parseInt(l.get(2)),l.get(3),"M",l.get(4))).forEach(listaPeliculasOscarizadas::add);
            contenidoCSVH.map(l -> Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l -> new PeliculaOscarizada(Integer.parseInt(l.get(1)), Integer.parseInt(l.get(2)),l.get(3),"H",l.get(4))).forEach(listaPeliculasOscarizadas::add);

        }catch (IOException e){
            System.err.println("Error al leer el fichero CSV");
        }

    }


    // 2. convertirPeliculasOscarizadasEnActores: dada una lista de PeliculasOscarizadas, devuelve una lista de objetos Actor
    //                                 en la que estarán incluidos todos los actores y actrices.

    public void convertirPeliculasOscarizadasEnActores() {
        listaActores = listaPeliculasOscarizadas.stream().map(p -> new Actor(p.getActor(),p.getSexo(),p.getAnyo() - p.getEdad(),listaPeliculasOscarizadas.stream().filter(p2 -> p2.getActor().equals(p.getActor())).map(p2 -> new entities.Pelicula(p2.getPelicula(),p2.getAnyo())).collect(toList()))).distinct().collect(toList());
    }

    // 3. escribirActoresenJson: escribe en un fichero JSON la lista de actores/actrices en el formato solicitado.

    public void escribirActoresenJson(Path ficheroJSON) throws StreamWriteException {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(ficheroJSON.toFile(), listaActores);
        } catch (IOException e) {
            System.err.println("Error al escribir el fichero JSON");
        }
    }

    // 4. actoresConMasdeUnOscar: devuelve una lista de Strings con los nombres de los actores/actrices que hayan ganado más de un Oscar.
    public List<String> actoresConMasdeUnOscar() {
        List<String> listaActoresConMasdeUnOscar = new ArrayList<>();
        listaPeliculasOscarizadas.stream().filter(p -> listaPeliculasOscarizadas.stream().filter(p2 -> p2.getActor().equals(p.getActor())).count() > 1).forEach(p -> listaActoresConMasdeUnOscar.add(p.getActor()));
        return listaActoresConMasdeUnOscar.stream().distinct().collect(toList());
        //return listaActores.stream().filter(a -> listaPeliculasOscarizadas.stream().filter(p -> p.getActor().equals(a.getNombre())).count() > 1).map(Actor::getNombre).collect(toList());
    }

    // 5. actoresMasJovenesEnGanarUnOscar: devuelve una lista de Strings con el actor y la actriz más jóvenes en ganar un Oscar.

        //public List<String> actoresMasJovenesEnGanarUnOscarQueEnElMomentoDeGanarElOscarEranLosMásJovenes() {
            //List<String> listaActoresMasJovenes = new ArrayList<>();
            //listaActoresMasJovenes.add(listaActores.stream().filter(a -> a.getSexo().equals("M")).max(Comparator.comparing(Actor::getAnyoNacimiento)).get().getNombre());
            //listaActoresMasJovenes.add(listaActores.stream().filter(a -> a.getSexo().equals("H")).max(Comparator.comparing(Actor::getAnyoNacimiento)).get().getNombre());
            //return listaActoresMasJovenes;
        //}


}
