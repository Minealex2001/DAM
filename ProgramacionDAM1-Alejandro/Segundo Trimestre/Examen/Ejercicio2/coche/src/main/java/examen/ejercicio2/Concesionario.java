package examen.ejercicio2;

import java.util.Scanner;

/*
 * Examen Segunda Evaluacion Ejercicio 2
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class Concesionario 
{
    public static void main( String[] args ){

        //Inicializamos todas las variables.
        int respuesta = 0, control = 0, respuestausuario=0;
        String matricula, color, propietario;
        int plazas;
        float cilindrada;
        Coche concesionario[] = new Coche[10];
        Scanner entrada = new Scanner(System.in);
        
        //Mostramos el menu
        do{
        System.out.println("1. Crea obejeto");
        System.out.println("2. Vende el coche");
        System.out.println("3. Pinta el coche");
        System.out.println("4. Muestra el coche");
        System.out.println("5. Salir");
        respuesta = entrada.nextInt();

        switch (respuesta) {
            case 1:
            //Preguntamos para crear el coche
                System.out.println("¿Que matricula tiene?");
                matricula = entrada.nextLine();
                System.out.println("¿De que color es?");
                color = entrada.nextLine();
                System.out.println("¿Que cilindrada tiene?");
                cilindrada = entrada.nextFloat();
                System.out.println("¿Cuantas plazas tiene?");
                plazas = entrada.nextInt();
                System.out.println("¿Quien es su propietario?");
                propietario = entrada.nextLine();

                concesionario[control] = new Coche(matricula, color, propietario, plazas, cilindrada);
                control++;
                break;


            //Cambia de propietario el coche.
            case 2:
            System.out.println("¿Que coche deseas elegir?");
            respuestausuario = entrada.nextInt();
            System.out.println("¿Quien es el nuevo propietario?");
            concesionario[respuestausuario].setPropietario(entrada.nextLine());
            break;
            
            //Cambia de color el coche elgido.
            case 3:
            System.out.println("¿Que coche deseas elegir?");
            respuestausuario = entrada.nextInt();
            System.out.println("¿De que color quieres pintarlo");
            concesionario[respuestausuario].setColor(entrada.nextLine());

            //Muestra el coche seleccionado
            case 4:
            System.out.println("¿Que coche deseas mostrar?");
            respuestausuario = entrada.nextInt();
            concesionario[respuestausuario].Visualiza();
            default:
                break;
        }
        }while(respuesta != 5);
        //Cierra el escaner.
        entrada.close();
        }
}
