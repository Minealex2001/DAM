import  java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el numero final: ");
        n = entrada.nextInt();

        for (int c = 0; c <= n; c++) {
            System.out.println(c);
        }
        entrada.close();
    }
}
