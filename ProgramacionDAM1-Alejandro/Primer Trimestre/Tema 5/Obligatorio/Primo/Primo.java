package Primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        //Leo el numero a calcular
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = entrada.nextInt();
        //Inicializo la variable raiz y le doy el valor del resultado de la raiz cuadrada del numero ingresado anteriormente. Tambien inicializo las variables X e y
        double raiz = Math.sqrt(numero), x=0, y=0;
        //Hago un for inicializando el contador con el numero primo 2 y lo comparo con la raiz del numero para salir del bucle
        for(int c = 2; c <= raiz; c++){
            //Compruebo si la division entre el numero y el contador da de resto 0, si es asi entra y le da a Y el valor del cociente y a X el valor del contador
            if(numero % c == 0){
                y = numero / c;
                x = c;
            }
        }
        //Muestro el resultado
        if (x==0 && y==0){
            System.out.print("El " + numero + " es un numero primo.");
        }else if (x == y) {
            System.out.print("El " + numero + " no es un numero primo se puede dividir entre " + x);
        }else {
            System.out.print("El " + numero + " no es un numero primo se puede dividir entre " + x + " y "+ y);
        }
        entrada.close();
    }
}