import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean negativo= false;

        for (int c=1; c <= 10; c++) {
            int numero;
            System.out.print("Escribe un numero no nulo: ");
            numero = entrada.nextInt();

            while (numero == 0) {
                System.out.print("Escribe un numero no nulo: ");
                numero = entrada.nextInt();
            }

            if (numero < 0){
                negativo = true;
            }
        }

        if (negativo) {
            System.out.println("Se han encontrado numeros negativos.");
        } else {
            System.out.println("No han encontrado numeros negativos.");
        }
        entrada.close();
    }
}
