package alumno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Alumno("pepe", "12345678", LocalDate.parse("2003-06-22")));
        lista.add(new Alumno("ana",  "87654321X", LocalDate.parse("1999-01-11")));
        lista.add(new Alumno("luis", "00000000T", LocalDate.parse("2002-02-28")));
        lista.get(0).asignarLetraDNI();
        System.out.println("Lista inicial:\n"+lista);
        Collections.sort(lista, Comparator.comparing(Persona::getFechaNacimiento).reversed());
        System.out.println("Lista ordenada por edad:\n"+lista);
    }
}
