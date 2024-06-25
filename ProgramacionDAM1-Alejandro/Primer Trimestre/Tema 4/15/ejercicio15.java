import java.util.Scanner;;
public class ejercicio15 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escribe el siguente numero: ");
        num2 = entrada.nextInt();
        System.out.print("Escribe el ultimo numero: ");
        num3 = entrada.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " es el mayor");
        }else if(num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else { 
            System.out.println(num3 + " es el mayor");
        }
    }
}
