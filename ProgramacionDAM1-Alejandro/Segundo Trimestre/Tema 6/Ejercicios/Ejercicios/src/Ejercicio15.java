import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el valor X: ");
        int x = entrada.nextInt();
        System.out.print("Introduce el valor Y: ");
        int y = entrada.nextInt();

        int array[] = new int[x];

        Arrays.fill(array, y);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        entrada.close();
    }
}
