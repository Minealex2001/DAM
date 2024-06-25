import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escribe otro numero: ");
        num2 = entrada.nextInt();
        if(num1 > num2) {
            System.out.println(num1 + " "+ num2);
        }else {
            System.out.println(num2 + " "+ num1);
        }
    }
}
