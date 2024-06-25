import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.print("Escribe un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escribe otro numero: ");
        num2 = entrada.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " es mayor");
        }else if (num1 == num2){
            System.out.println("Los dos numeros son iguales.");
        }else {
            System.out.println(num2+ " es mayor");
        }
    }
}
