
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int num1, num2, suma, resta, mult, div;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escribe el siguente numero: ");
        num2 = entrada.nextInt();
        if (num2 == 0) {
            suma = num1 + num2;
            resta = num1 - num2;
            mult = num1 * num2;
            System.out.println("La suma es: " + suma + " La resta es: " + resta + " La multiplicacion es: " + mult );
            System.out.print("La division es imposible");
        } else {
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        System.out.println("La suma es: " + suma + " La resta es: " + resta + " La multiplicacion es: " + mult + " La division es: " + div);
        }
    }
}