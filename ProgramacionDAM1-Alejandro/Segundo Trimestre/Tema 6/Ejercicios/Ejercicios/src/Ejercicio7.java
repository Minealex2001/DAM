import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p=0,q=0;
        int numeros[];
        System.out.print("Introduce un valor: ");
        p = entrada.nextInt();
        System.out.print("Introduce otro valor: ");
        q = entrada.nextInt();      
        numeros = new int[(q-p)+1];     
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=p;
            p++;
            System.out.print(numeros[i] + " ");
        }
        entrada.close();
    }
}
