import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int positivo=0, negativo=0;
        for (int c=0; c <= 10; c++) {
            int numero;
            System.out.print("Escribe un numero no nulo: ");
            numero = entrada.nextInt();

            while (numero == 0) {
                System.out.print("Escribe un numero no nulo: ");
                numero = entrada.nextInt();
            }

            if (numero < 0){
                negativo++;
            }else {
                positivo++;
            }
        }

        System.out.println("Se han encontrado "+positivo+" numeros positivos y "+negativo+ " numeros negativos");
        entrada.close();
    }
}
