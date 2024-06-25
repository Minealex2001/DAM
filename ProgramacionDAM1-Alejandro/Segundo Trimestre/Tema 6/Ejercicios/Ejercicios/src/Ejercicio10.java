import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿De cuantas personas quieres almacenar la altura?");
        int personas = entrada.nextInt();
        int altura[] = new int[personas];
        int suma=0;
        
        for(int i=0; i<altura.length; i++){
            System.out.print("Añade una altura: ");
            altura[i] = entrada.nextInt();
        }
        Arrays.sort(altura);
        System.out.println("La altura más pequeña es: " + altura[0]);
		System.out.println("La altura más grande es:  " + altura[altura.length - 1]);
        for(int i=0; i<altura.length; i++){
            suma = suma + altura[i];
        }
        int media = suma/altura.length;
        System.out.println("La media de altura es: "+ media);


        entrada.close();
    }
}
