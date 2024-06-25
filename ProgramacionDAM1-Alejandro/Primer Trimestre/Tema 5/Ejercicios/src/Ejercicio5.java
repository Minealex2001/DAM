import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 0;
        double factor = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el numero del cual quieres calcular: ");
        numero = entrada.nextInt();

        while (numero < 0) {
            System.out.print("Escribe el numero del cual quieres calcular: ");
            numero = entrada.nextInt();
        } 

        for (int c = 1; c <= numero; c++) {
            factor = factor * c;
        }

        System.out.println("El numero factorial es: "+ factor);
        entrada.close();
    }
}
