import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, numeros[] = new int[10], suma=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            numeros[i] = numero;
            suma = numeros[i] + suma;          
        }
        System.out.print("El resultado es: " + suma);
        entrada.close();
    }
}
