
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
            System.out.print("Escribe el radio: ");
            Scanner entrada = new Scanner(System.in);
            double radio, longi, area, vol ;
            radio = entrada.nextDouble();
                longi = radio * 2;
                area = Math.pow(radio,2);
                vol = (4/3)*Math.PI*(radio*radio*radio);
            System.out.println("La longitud es: " + longi + " El area es: " + area + " El volumen es: " + vol  );
        }
}
