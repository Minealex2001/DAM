package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public abstract class Vehiculo {
    
    //Variables necesarias para el objeto.
    private static float precioBase=50; 
    private String matricula;
    private String tipo;

    //Constructor del objeto.
    public Vehiculo(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    //Getters del objeto
    public static float getPrecioBase() {
        return precioBase;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMatricula() {
        return matricula;
    }

   //Metodo abstacto.
    public abstract float precioAlquilerVehiculo(int dias);

}