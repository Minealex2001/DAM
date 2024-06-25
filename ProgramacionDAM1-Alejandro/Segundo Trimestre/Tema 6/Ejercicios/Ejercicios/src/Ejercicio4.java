import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
              
        Scanner entrada = new Scanner(System.in);
        int numero, numeros[] = new int[10], pos=0, neg=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            numeros[i] = numero;
            if (numeros[i]>=0) {
                pos += numeros[i];
            }else {
                neg += numeros[i];         
            }
        }
        System.out.println("La suma de los valores positivos es: " + pos);

        System.out.println("La suma de los valores negativos es: " + neg);
        entrada.close();
    }
}