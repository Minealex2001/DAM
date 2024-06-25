import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numero = entrada.nextInt(), total;

        total = numero / 3;
        
        System.out.println("Hay un total de: " + total + "múltiplos de 3.");
        entrada.close();
    }
}
