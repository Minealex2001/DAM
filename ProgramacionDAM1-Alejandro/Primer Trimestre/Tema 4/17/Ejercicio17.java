import java.util.Scanner;;
public class Ejercicio17 {
    public static void main(String[] args) {
        int dias = 00, horas = 00, minutos = 00, segundos = 00;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe las horas: ");
        horas = entrada.nextInt();
        System.out.print("Escribe los minutos: ");
        minutos = entrada.nextInt();
        System.out.print("Escribe los segundos: ");
        segundos = entrada.nextInt();
        segundos = segundos + 1;
        if (segundos >= 60 ) {
            segundos = 00;
            minutos = minutos + 1 ;
        }
        if (minutos >= 60) {
            minutos = 00;
            horas = horas + 1;
        }
        if (horas >= 24 ) {
            horas = 00;
            dias = 01;
        }
    System.out.println("Ahora son " +dias+" dias "+horas+" horas "+minutos+" minutos "+segundos+" segundos.");
    }
}    