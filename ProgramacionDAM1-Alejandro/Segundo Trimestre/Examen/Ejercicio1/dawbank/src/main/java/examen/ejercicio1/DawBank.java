package examen.ejercicio1;

import java.util.Scanner;

/*
 * Examen Segunda Evaluacion Ejercicio 1
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class DawBank {
    public static void main(String[] args) {

        //Inicializamos el escaner.
        Scanner entrada = new Scanner(System.in);

        //Inicializamos las variables
        String iban, nombre;
        int respuesta = 0;
        double dinero = 0;

        //Informamos al usuario que tiene que introducir un numero de IBAN
        System.out.println("Para crear una cuenta, porfavor indique un numero de IBAN.");
        System.out.println("Tiene que tener el siguiente formato: 'ESXXXXXXXXXXXXXXXXXXXXXX'");
        iban = entrada.nextLine();

        //Informamos al usuario que introduzca un Nombre y Apellidos para el titular.
        System.out.println("Para continuar introduce un Nombre y Apellido del titular.");
        nombre = entrada.nextLine();

        //Inicializamos y llamamos al constructor de nuestro objeto.
        CuentaBancaria cuentas = new CuentaBancaria(iban, nombre);

        //Realizamos un DO-WHILE para que el programa se mantenga en bucle hasta que el usuario ingrese un 8.
        do{

        //Mostramos el menu y leemos la respuesta.
        System.out.println("1. Mostrar datos de la cuenta");
        System.out.println("2. Mostrar el IBAN");
        System.out.println("3. Mostrar el nombre del titular");
        System.out.println("4. Mostrar el saldo disponible en cuenta");
        System.out.println("5. Ingresar dinero");
        System.out.println("6. Retirar dinero");
        System.out.println("7. Mostrar los movimientos");
        System.out.println("8. Salir");
        System.out.println("Elige la opcion deseada");
        respuesta = entrada.nextInt();

        //Segun la respuesta ingresada entraremos en un caso del switch.
        switch (respuesta) {

            //Caso 1 - Mostrar datos de la cuenta.
            case 1:
                System.out.println("Los datos de la cuenta son:");
                System.out.println("IBAN: " + cuentas.getIban());
                System.out.println("Titular de la cuenta: " + cuentas.getNombre());
                System.out.println("Saldo disponible en cuenta: " + cuentas.getSaldo() + "€");
                break;

            //Caso 2 - Mostrar el IBAN de la cuenta.
            case 2:
                System.out.println("El IBAN de la cuenta es: " + cuentas.getIban());
                break;

            //Caso 3 - Mostrar el titular de la cuenta.
            case 3:
                System.out.println("El titular de la cuenta es: " + cuentas.getNombre());
                break;

            //Caso 4 - Mostrar el saldo disponible en cuenta.
            case 4:
            System.out.println("El saldo disponible en cuenta es de " + cuentas.getSaldo() + "€");
            break;

            //Caso 5 - Ingreso de dinero.
            case 5:

            //Preguntamos al usuario cual es la cantidad deseada.
            System.out.println("¿Cual es la cantidad que deseas ingresar?");
            dinero = entrada.nextDouble();

            //Realizamos el ingreso en la condicion del IF, ya que devuelve un boolean para avisar al usuario si el movimimiento se ha realizado.
            if(cuentas.ingreso(dinero)){
                System.out.println("[INFO] ¡Ingreso realizado con exito!");
            }else{
                System.err.println("[ERROR] Saldo no ingresado. Intentelo de nuevo.");
            }
            break;

            //Caso 6 - Retirada de dinero
            case 6:

            //Preguntamos al usuario cual es la cantidad deseada.
            System.out.println("¿Cual es la cantidad que deseas retirar?");
            dinero = entrada.nextDouble();

            //Realizamos el ingreso en la condicion del IF, ya que devuelve un boolean para avisar al usuario si el movimimiento se ha realizado.
            if(cuentas.retirada(dinero)){
                System.out.println("[INFO] ¡Retirada realizada con exito!");
            }else{
                System.err.println("[ERROR] Saldo no retirado. Intentelo de nuevo.");
            }

            //Caso 7 - Mostrar el historial de movimientos.
            case 7:

            //Utilizamos un FOR, en la condicion del FOR utilizamos el getter de ControlMovimientos para saber hasta que posicion se han guardado los movimientos.
            for(int i=0; i<cuentas.getControlMovimientos();i++){

                //Llamamos al getter movimientos, que devolvera el string almacenado en ese espacio de memoria.
                System.out.println(cuentas.getMovimientos(i));
            }
            default:
                break;
        }

        //Comprobamos que la respuesta sea distinta de 8 para seguir en el programa, si es igual a 8 el programa termina.
        }while(respuesta!=8);
        System.out.println("¡Gracias por usar el programa!");

        //Cerramos el escaner.
        entrada.close();
    }
}
