import java.util.Scanner;;
public class ejercicio16 {
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe la nota: ");
        num1 = entrada.nextInt();
        if (num1 <= 3) {
            System.out.println("El examen es muy deficiente");
    }else if (num1 <= 5) {
        System.out.println("El examen es suficiente");
    }else if (num1 <= 6) {
        System.out.println("El examen esta bien");
    }else if (num1 <= 9) {
        System.out.println("El examen esta notable");
    }else {
            System.out.println("El examen es excelente");
    }
  }
}