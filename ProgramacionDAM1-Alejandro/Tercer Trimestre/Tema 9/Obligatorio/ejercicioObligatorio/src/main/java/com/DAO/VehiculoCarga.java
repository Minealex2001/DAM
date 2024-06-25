package com.DAO;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public abstract class VehiculoCarga extends Vehiculo {
    
    //Instanciamos las variables necesarias.
    private static final float tasaPMA = 20;
    private float pma;
   

    //Constructor del objeto.
    public VehiculoCarga(float pma, String matricula, String tipo) {
        super(matricula, tipo);
        this.pma = pma;
    }


    //Getters de la objeto.
    public float getPma() {
        return pma;
    }

    public static float gettasaPMA() {
        return tasaPMA;
    }

    //Método abstracto.
    @Override
    public abstract float precioAlquilerVehiculo(int dias);
     
}
