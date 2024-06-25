package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class Camion extends VehiculoCarga {

    //Instanciamos las variables necesarias para el objeto.
    private final static float precioFijo=40;

    //Constructor del objeto.
    public Camion(float pma, String matricula, String tipo) {
        super(pma, matricula, tipo);
        }
    

    //Metodo abstracto con el que sacamos el precio el alquiler.
    @Override
    public float precioAlquilerVehiculo(int dias) {
        float precio;
        precio=(VehiculoCarga.gettasaPMA()* getPma()) + (getPrecioBase()*(float)dias) + precioFijo;
        return precio;
    }

}