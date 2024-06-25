import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        int numero, numeros[] = new int[10], suma=0, min, max;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            numeros[i] = numero;
            suma = numeros[i] + suma;          
        }
        max = numeros[0];
        min = numeros[0];
        
        for (int i = 0; i < 10; i++) {
           
            if (numeros[i] >= max) {
                max = numeros[i];
            }
            
            if (numeros[i] <= min) {
                min = numeros[i];
            }
        }
        System.out.println("De los números introducidos el máximo es " + max + " y el mínimo es " + min + ".");
        entrada.close();  
    }
}
