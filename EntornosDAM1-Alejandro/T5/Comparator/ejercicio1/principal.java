package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class principal {

  public static void main(String[] args) {
    ArrayList<persona> lista_persona = new ArrayList<>();
    lista_persona.add(new persona("Mario", 187, 22));
    lista_persona.add(new persona("Pepe", 173, 52));
    lista_persona.add(new persona("Manuel", 158, 27));
    lista_persona.add(new persona("David", 164, 25));
    lista_persona.add(new persona("Alberto", 184, 80));

    for (persona persona:lista_persona){
        System.out.println(persona.getNombre()+" "+persona.getAltura()+" "+persona.getEdad());
    }

    Collections.sort(lista_persona);
    System.out.println("\nLista ordenada por altura:");
    for (persona persona : lista_persona) {
        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getAltura());
    }

    Collections.sort(lista_persona);
    System.out.println("\nLista ordenada por edad:");
    for (persona persona : lista_persona) {
        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getAltura());
    }
  }
}
