import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
            System.out.print("Escribe el lado: ");
        Scanner entrada = new Scanner(System.in);
        int lado;
        lado = entrada.nextInt();
        System.out.println("El área del cuadrado es: " + (lado * lado));
    }
}
