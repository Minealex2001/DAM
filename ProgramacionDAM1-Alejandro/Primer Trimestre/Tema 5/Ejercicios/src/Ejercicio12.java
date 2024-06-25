import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        int numeroa, numerob, numerototal;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe el numero que quieres elevar:");
        numeroa = entrada.nextInt();
        System.out.print("Escribe su exponente:");
        numerob = entrada.nextInt();
        numerototal = numeroa;

        for (int c=1; c <= numerob; c++) {
            numerototal = numerototal * numeroa;
        }
        System.out.println(numeroa + " elevado a " + numerob + " da: " + numerototal);
        entrada.close();
    }
}
