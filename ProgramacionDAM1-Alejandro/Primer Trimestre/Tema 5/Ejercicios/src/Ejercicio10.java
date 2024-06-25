import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
          int nota = 0;
          boolean nota10 = false;
          Scanner entrada = new Scanner(System.in);
      
            while (nota != -1) {
                System.out.print("Escribe una nota entre 1 y 10: ");
                nota = entrada.nextInt();
                
                if (nota != 10) {
                }else {
                    nota10 = true;
                }
            }
            if (nota10) {
                System.out.print("He leido una nota 10.");
            }
            entrada.close();
        }   
}
