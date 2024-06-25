import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, fallados=0, total=0, numeroant = 0;
        do {
            System.out.print("Escribe un numero:");
            numero = entrada.nextInt();
            if (numero < numeroant) {
                System.out.println("Fallo es menor");
                fallados++;
            }
            numeroant = numero;
            total++;
        } while (numero != 0);
    System.out.println("Numero total de numeros: " + total);
    System.out.print("Numeros fallados: " + fallados);
    entrada.close();
    }
}
