import java.util.Scanner;

public class Refactorizame {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        
        System.out.println("Leyendo la tabla a");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Numero: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Leyendo la tabla b");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Numero: ");
            b[i] = entrada.nextInt();
        }
        
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.println("La tabla c queda: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
