package com.principal;

/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.DAO.*;

public class principal 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {

        //Declaracion de las varibales necesarias asi como el scanner.
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int respuesta, dias;
        String tipoVehiculo, matricula;

        //Menu.
        do{
        System.out.println("Menu: ");
        System.out.println("1. Añadir Vehiculo.");
        System.out.println("2. Obten el precio del alquiler.");
        System.out.println("3. Mostrar todos los precios.");
        System.out.println("4. Salir.");

        respuesta = Integer.parseInt(entrada.readLine());

        //Una vez leemos el numero introduccido entramos en un caso diferente del Switch.
        switch (respuesta) {
            case 1:

                //Preguntamos que tipo de vehiculo que quiere añadir.
                System.out.println("¿Que tipo de vehiculo quieres añadir?");
                System.out.println("Pueden ser Coche, Furgoneta, MicroBus, Camion.");
                tipoVehiculo = entrada.readLine();

                //Dependiendo del vehiculo entrara en un caso diferente, ya que he decidido que cada vehiculo tenga
                //un metodo diferente para que el main no tenga una gran cantidad de codigo.
                switch (tipoVehiculo) {
                    case "Coche":
                        añadirCoche(entrada);
                        break;
                    
                    case "Furgoneta":
                        añadirFurgoneta(entrada);
                        break;

                    case "MicroBus":
                        añadirMicroBus(entrada);
                        break;

                    case "Camion":
                        añadirCamion(entrada);
                    break;

                    default:
                        System.err.println("[ERROR]: El vehiculo especificado no existe");
                        break;
                }
                
                break;
        
            case 2:

                System.out.println("¿Cual es la matricula del vehiculo? Introducelo con el formato 1111AAA");
                matricula = entrada.readLine();

                System.out.println("¿Cuantos dias ha durado el alquiler?");
                dias = Integer.parseInt(entrada.readLine());

                Alquiler.precioAlquilerUno(dias, matricula);

                break;

            case 3:

            System.out.println("¿Cuantos dias va ha durar el alquiler?");
            dias = Integer.parseInt(entrada.readLine());

            Alquiler.precioAlquilerTotal(dias);

                break;
            default:
                break;
        }

        }while(respuesta != 4);

        entrada.close();
    }



    //Metodo que utilizamos para añadir los coches.
    public static void añadirCoche(BufferedReader entrada) throws NumberFormatException, IOException{
        String matricula;
        int plazas;        
        do{
            System.out.println("¿Cual es la matricula del coche a añadir? Introducelo con el formato 1111AAA");
            matricula = entrada.readLine();
        }while(!comprobarMatricula(matricula));

        do{
            System.out.println("¿Cuantas plazas tiene el coche?");
            plazas = Integer.parseInt(entrada.readLine());
        }while(!comporbarPlazas(plazas));

        String tipo = "coche";

        Alquiler.añadirvehiculo(new Coche(matricula, plazas, tipo));
    }

    //Metodo con el que añadimos las furgonetas.
    public static void añadirFurgoneta(BufferedReader entrada) throws NumberFormatException, IOException{
        String matricula;
        int pma;        
        do{
            System.out.println("¿Cual es la matricula de la furgoneta a añadir? Introducelo con el formato 1111AAA");
            matricula = entrada.readLine();
        }while(!comprobarMatricula(matricula));

        do{
            System.out.println("¿Cual es la PMA de la furgoneta en Toneladas?");
            pma = Integer.parseInt(entrada.readLine());
        }while(!comprobarPMA(pma));

        String tipo = "furgoneta";
        Alquiler.añadirvehiculo(new Furgoneta(pma, matricula, tipo));
    }

    //Metodo con el que añadimos los MicroBuses.
    public static void añadirMicroBus(BufferedReader entrada) throws NumberFormatException, IOException{
        String matricula;
        int plazas;        
        do{
            System.out.println("¿Cual es la matricula del MicroBus a añadir? Introducelo con el formato 1111AAA");
            matricula = entrada.readLine();
        }while(!comprobarMatricula(matricula));

        do{
            System.out.println("¿Cuantas plazas tiene el MicroBus?");
            plazas = Integer.parseInt(entrada.readLine());
        }while(!comporbarPlazas(plazas));

        String tipo = "microbus";

        Alquiler.añadirvehiculo(new MicroBus(matricula, plazas, tipo));
    }

        //Metodo con el que añadimos los camiones.
    public static void añadirCamion(BufferedReader entrada) throws NumberFormatException, IOException{
        String matricula;
        int pma;        
        do{
            System.out.println("¿Cual es la matricula del camion a añadir? Introducelo con el formato 1111AAA");
            matricula = entrada.readLine();
        }while(!comprobarMatricula(matricula));

        do{
            System.out.println("¿Cuanto es el PMA del camion?");
            pma = Integer.parseInt(entrada.readLine());
        }while(!comprobarPMA(pma));

        String tipo = "camion";

        Alquiler.añadirvehiculo(new Camion(pma, matricula, tipo));
    }

    //Metodo con el que devolvemos un booleano al comprobar si el formato de la matricula es correcta.
    public static boolean comprobarMatricula(String matricula){
        return matricula.matches("^\\d{4}[a-zA-Z]{3}$");
    }

    //Metodo en el que devolvemos un booleano al comprobar si el numero de plazas es correcto.
    public static boolean comporbarPlazas(int plazas){
        boolean correcto;

        if(plazas<=0){
            correcto = false;
        }else{
            correcto = true;
        }
        return correcto;
    }

    //Metodo en el cual devolvemos un booleano al comprobar si la PMA es correcta.
    public static boolean comprobarPMA(int pma){
        boolean correcto;

        if(pma<=0){
            correcto = false;
        }else{
            correcto = true;
        }
        return correcto;
        
    }
}
