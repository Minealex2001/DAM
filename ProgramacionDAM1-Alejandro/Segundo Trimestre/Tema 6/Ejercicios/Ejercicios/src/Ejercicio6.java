import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[],n,m;
        System.out.print("Introduce un valor: ");
        n = entrada.nextInt();
        System.out.print("Introduce otro valor: ");
        m = entrada.nextInt();     
        numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
            System.out.print(numeros[i] + " ");
        }
        entrada.close();
    }
}
