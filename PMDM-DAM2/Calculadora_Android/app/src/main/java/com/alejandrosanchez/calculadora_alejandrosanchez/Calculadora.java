package com.alejandrosanchez.calculadora_alejandrosanchez;

import java.util.ArrayList;

/**
 * Clase que contiene los métodos para realizar las operaciones
 * @version 1.0
 * @since 1.0
 * @see ArrayList
 * @see String
 */
public class Calculadora {

    /**
     * Método que realiza las operaciones
     * @param operacion ArrayList que contiene los valores a calcular
     * @see ArrayList
     * @see String
     * @since 1.0
     * @version 1.0
     */
    public void hacerOperacion(ArrayList<String> operacion){

        /**
         * Método que realiza las operaciones
         */
        int i = 0;

        while (i < operacion.size()) {

            if(operacion.get(i).equals("*")){
               operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) * Integer.parseInt(operacion.get(i+1))));
               operacion.remove(i);
               operacion.remove(i);
               i--;

            }else if(operacion.get(i).equals("/")){

                if(operacion.get(i+1).equals("0")){
                    operacion.clear();
                    operacion.add("ERROR");
                    break;
                }

                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) / Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);

                i--;

            }

            i++;

        }

        i = 0;

        while (i < operacion.size()) {

            if(operacion.get(i).equals("+")){
                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) + Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);
                i--;

            }else if(operacion.get(i).equals("-")){
                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) - Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);
                i--;
            }
            i++;
        };
    }

}
