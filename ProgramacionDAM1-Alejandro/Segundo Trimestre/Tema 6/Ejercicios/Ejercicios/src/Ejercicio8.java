import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[100],num;
        int cont=0;
        System.out.print("Dime un número entre 0,0 y 1,0: ");
        num = entrada.nextFloat();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(float)Math.random()*1+0;
            if (numeros[i]>=num) {
                cont++;
            }
        }
        System.out.println(cont + " números son iguales o mayores a "+ num);
        entrada.close();
    }
}
