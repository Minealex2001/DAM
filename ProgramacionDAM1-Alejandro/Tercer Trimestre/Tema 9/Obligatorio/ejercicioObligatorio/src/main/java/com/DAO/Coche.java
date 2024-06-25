package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class Coche extends Vehiculo {
    //Instanciamos los atributos necesarios para el objeto
    private int plazas;
   
    //Creamos el constructor del objeto 
    public Coche(String matricula, int plazas, String tipo){
        super(matricula, tipo);
        this.plazas=plazas;
    }

    //Getter de la clase
    public int getPlazas() {
        return plazas;
    }


    //Metodo abstracto con el que sacamos el precio el alquiler.
    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio = (getPrecioBase()* (float)dias) + ((float)getPlazas() * 1.5f * (float)dias);
        return precio;
    }            
}