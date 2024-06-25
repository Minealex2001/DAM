import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero[] = new int[20],suma=0,media=0;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce un número: ");
            numero[i] = entrada.nextInt();
            suma += numero[i];
        }

        media = suma/numero.length;
        System.out.println("La media es: " + media);
        entrada.close();
    }
}
