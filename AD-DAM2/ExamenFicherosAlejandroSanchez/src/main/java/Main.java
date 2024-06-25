import utils.Utilidades;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Utilidades utilidades = new Utilidades();

        utilidades.convertirPeliculasOscarizadasEnActores();

        utilidades.escribirActoresenJson(Path.of("src/main/resources/salida/actores.json"));

        List<String> actoresConMasdeUnOscar = utilidades.actoresConMasdeUnOscar();
        System.out.println("Actores con más de un Oscar: " + actoresConMasdeUnOscar);

        //List<String> actoresMasJovenesEnGanarUnOscar = utilidades.actoresMasJovenesEnGanarUnOscarQueEnElMomentoDeGanarElOscarEranLosMásJovenes();
        //System.out.println("Actores más jóvenes en ganar un Oscar: " + actoresMasJovenesEnGanarUnOscar);
    }
}
