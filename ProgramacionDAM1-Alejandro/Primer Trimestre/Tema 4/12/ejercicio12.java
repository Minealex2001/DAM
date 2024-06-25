import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num1 = entrada.nextInt();

        if (num1 >= 0) { 
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }
    }
}
