import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double precio, descuento, porcentaje;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe el precio original: ");
        precio = entrada.nextDouble();
        System.out.print("Escribe el descuneto aplicado: ");
        descuento = entrada.nextDouble();
        porcentaje = (descuento * 100)/precio;
        porcentaje = 100  - porcentaje;
        System.out.print("El precio es:"+ porcentaje);
    }
}
