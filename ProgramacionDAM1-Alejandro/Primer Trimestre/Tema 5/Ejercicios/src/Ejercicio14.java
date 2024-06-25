import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int billetes500 = 0, billetes200 = 0, billetes100 = 0, billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0;

        System.out.print("Introduce la cantidad de euros (multiplo de 5): ");
        int dinero = entrada.nextInt(), dinerotot = dinero;

        while (dinero >= 500) {
            billetes500++;
            dinero = dinero - 500;
        }
        while (dinero >= 200) {
            billetes200++;
            dinero = dinero - 200;
        }
        while (dinero >= 100) {
            billetes100++;
            dinero = dinero - 100;
        }
        while (dinero >= 50) {
            billetes50++;
            dinero = dinero - 50;
        }
        while (dinero >= 20) {
            billetes20++;
            dinero = dinero - 20;
        }
        while (dinero >= 10) {
            billetes10++;
            dinero = dinero - 10;
        }
        while (dinero >= 5) {
            billetes5++;
            dinero = dinero - 5;
        }
        System.out.println("Para " + dinerotot + " necesitas: " + billetes500 + " billetes de 500, " + billetes200 + " billetes de 200, " + billetes100 + " billetes de 100, " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5.");
        entrada.close();
    }
}
