package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Alquiler {

//Creamos el array de vehiculos.
private static ArrayList<Vehiculo> vehiculo = new ArrayList<>();

//Metodo con el que añadimos al array el vehiculo.
public static void añadirvehiculo(Vehiculo v){
    vehiculo.add(v);
}

//Metodo con el que consultamos el precio del alquiler de un vehiculo basado en los dias. Se comprueba mediante la matricula del vehiculo.
public static void precioAlquilerUno(int dias, String matricula){

    Iterator<Vehiculo> iterador = vehiculo.iterator();
    Vehiculo elemento;
    Boolean hecho = false;

    while (iterador.hasNext()) {
        elemento = iterador.next();
        if(matricula.matches(elemento.getMatricula())){
            System.out.println("El precio del alquiler para el "+ elemento.getTipo() + " " + elemento.getMatricula() + " con una duracion de " + dias + " dias es de: " + elemento.precioAlquilerVehiculo(dias) + "€");
            hecho = true;
        }
    }

    if(!hecho){
        System.err.println("[ERROR] No se ha encontrado la matricula deseada.");
    }

}

//Metodo con el que consultamos el precio del alquiler de todos los vehiculos añadidos al arraylist.
public static void precioAlquilerTotal(int dias){

    Iterator<Vehiculo> iterador = vehiculo.iterator();
    Vehiculo elemento;

    while (iterador.hasNext()) {
        elemento = iterador.next();
        System.out.println("El precio del alquiler para el "+ elemento.getTipo() + " " + elemento.getMatricula() + " con una duracion de " + dias + " dias es de: " + elemento.precioAlquilerVehiculo(dias) + "€");
    }
}
}