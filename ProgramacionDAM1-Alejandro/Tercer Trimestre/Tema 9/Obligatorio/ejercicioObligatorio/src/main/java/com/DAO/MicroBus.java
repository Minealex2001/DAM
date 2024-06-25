package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class MicroBus extends Vehiculo {

    //Instanciamos las variables necesarias.
    private final static int precioPlaza=2;
    private int plazas;

    //Constructor del objeto
    public MicroBus(String matricula, int plazas, String tipo) {
        super(matricula, tipo);
        this.plazas = plazas;
    }

    //Getters necesarios para la clase.
    public static int getPrecioPlaza() {
        return precioPlaza;
    }
 
    public int getPlazas() {
        return plazas;
    }



    //Metodo abstracto con el que sacamos el precio el alquiler.
    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio = (getPrecioBase()* (float)dias);
        precio = precio + ((float)getPlazas() * 1.5f * (float)dias);
        precio = precio + ((float)getPlazas() * precioPlaza);
        return precio;
    }
}
