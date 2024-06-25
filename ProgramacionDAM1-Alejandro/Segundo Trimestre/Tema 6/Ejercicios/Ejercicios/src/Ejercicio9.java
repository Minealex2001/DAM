import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int array100Num[]=new int[100], numUsuario, posicion=0;
        System.out.print("Introduce un número: ");
        numUsuario = entrada.nextInt();
        for (int i = 0; i < array100Num.length; i++) {
            array100Num[i]= (int) (Math.random()*(10-1)+1);
        }
        for (int i = 0; i < array100Num.length; i++) {
            if (numUsuario==array100Num[i]) {
                posicion = i;
                System.out.println("El valor "+numUsuario+" esta en la posicion "+posicion);
            }
        }
    entrada.close();
    }
}