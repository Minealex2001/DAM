package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class Furgoneta extends VehiculoCarga {


    //Constructor del objeto.
    public Furgoneta(float pma, String matricula, String tipo) {
        super(pma, matricula, tipo);
    }


    //Metodo abstracto con el que sacamos el precio el alquiler.
    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio=(VehiculoCarga.gettasaPMA()* getPma()) + (getPrecioBase()*(float)dias);
        return precio;
    }

}