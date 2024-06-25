import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int metros, millas;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe las millas nauticas: ");
        millas = entrada.nextInt();
        metros = millas * 1852;
        System.out.print("La conversion de " + millas + "millas nauticas a metros es: "+ metros);
    }
}