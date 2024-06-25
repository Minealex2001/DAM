import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0){
            primo = false;
            }
            contador++;
        }
        if (primo) {
            System.out.println("El numero " + numero + " es primo");
        }else {
            System.out.println("El numero " + numero + " no es primo");
        }
        entrada.close();
    }
}
