import java.util.Scanner;

public class Ejercicio1{
public static void main(String[] args) {
    //Inicializo el escaner
    Scanner entrada = new Scanner(System.in);
    //Muestro el menu
    System.out.println("(a) Aprobados y suspendidos");
    System.out.println("(b) Billetes a Madrid");
    System.out.println("(c) Salir");

    String selec = entrada.nextLine();
    //Utilizo un Switch para ir directamente a la opcion elegida
    switch (selec){
        //Eleccion a
        case "a":
            //Declaro las variables de aprobados y suspensos
            int Aprobados=0, Suspendidos=0, n;
            //Hago un bucle el cual saldra cuando el usuario ingrese el valor -1
            do{
                System.out.println("Introduce una nota (Para finalizar introduce un -1):");
                n = entrada.nextInt();
                //Compruebo si el valor introducido es mayor a 5
                if(n >= 5){
                    Aprobados++;
                //Compruebo que el valor sea menor a 4 y que sea diferente de el valor -1 para salir
                }else if(n <= 4 && n != -1){
                    Suspendidos++;
                }
                }while(n != -1);
                //Muestro el resultado
                if(Aprobados > Suspendidos){
                    System.out.println("Se han encontrado más aprobados que suspendidos");
                }else{
                    System.out.println("Se han encontrado más suspendidos que aprobados");
            }
        
        break;

        case "b":
            //Declaro las variables necesarias
            String nombre;
            int edad=0;
            //El precio es Double a causa de los centimos
            Double preciomayor=0.0, precioadoles=0.0, precionino=0.0, precionormal = 0.0;
            //Mi metodo de control de tamaño de familia lo dejo a manos del usuario el cual indicara cuantos billetes necesita comprar
            System.out.println("¿Cuantos billetes necesitas?");
            int numerobilletes = entrada.nextInt();

            for (int c=1; c <= numerobilletes; c++){
                System.out.print("¿Cual es su nombre?");
                entrada.next();
                nombre = entrada.nextLine();
                System.out.print("¿Que edad tiene?");
                edad = entrada.nextInt();
                //Compruebo que la edad sea mayor o igual a 65 para aplicar el descuento
                if(edad >= 65){
                    preciomayor = (Double) preciomayor + (32 * 0.9);
                //Compruebo que la edad sea mayor o igual a 12 y menor o igual a 15 para aplicar el descuento
                }else if(edad >= 12 && edad <= 15){
                    precioadoles = (Double) precioadoles + (32 * 0.92);
                //Compruebo que la edad sea mayor o igual a 4 y menor o igual a 11 para aplicar el descuento
                }else if(edad >= 4 && edad <= 11){
                    precionino = (Double) precionino + (32 * 0.65);
                //Si no ha sido ninguna de las opciones anteriores compruebo si la edad esta entre 15 y 65
                //Ya que los menores de 4 no pagan el billete
                }else if(edad > 15 && edad < 65){
                    precionormal = (Double) precionormal + 32;
                }
            }
            //Calculo el precio total
            double preciototal = preciomayor + precioadoles + precionino + precionormal;
            //Muestro el resultado
            System.out.println("El precio total es de:" + preciototal);

        break;
    }
    entrada.close();
    }
}