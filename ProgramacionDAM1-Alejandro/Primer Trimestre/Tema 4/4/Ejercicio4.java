import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1, num2, Suma, Resta, Mult, Div ;
        num1 = entrada.nextInt();
        System.out.print("Escribe el siguente numero: ");
        num2 = entrada.nextInt();
            Suma = num1 + num2;
            Resta = num1 - num2;
            Mult = num1 * num2;
            Div = num1 / num2;
        System.out.println("La suma es: " + Suma + " La resta es: " + Resta + " La multiplicacion es: " + Mult + " La division es: " + Div );
    }
    
}
