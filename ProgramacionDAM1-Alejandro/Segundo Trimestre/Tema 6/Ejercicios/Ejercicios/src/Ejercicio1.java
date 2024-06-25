import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        int numero;
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            numeros[i] = numero;          
        }
        
        System.out.println("Los números almacenados son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        entrada.close();
    }
}