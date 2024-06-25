import java.util.Scanner;

public class Equacion {
        public static void main(String[] args) {
        //Inicializo el escaner y la respuesta
        Scanner entrada = new Scanner(System.in);
        String respuesta = "No";
        char respuestac = 'S';
        while(respuestac == 'S' || respuestac == 's') {
            //Leeo los numeros para cada variable
            System.out.print("Escribe el valor para a: ");
            double a = entrada.nextDouble();

            System.out.print("Escribe el valor para b: ");
            double b = entrada.nextDouble();

            System.out.print("Escribe el valor para c: ");
            double c = entrada.nextDouble();
            //Calculo el discriminante para comparar si es mayor o igual a 0
            double disc = Math.pow(b, 2) - 4*a*c;

            if(disc > 0) {
            //Resuelvo para cada caso la equacion y muestro el resultado
            double resultado1 = (-b +Math.sqrt(disc))/2*a;
            double resultado2 = (-b -Math.sqrt(disc))/2*a;
            System.out.println("+x= "+ resultado1 +" -x= "+resultado2);

            }else if (disc == 0) {

            double resultado1 = (-b +Math.sqrt(disc))/2*a;
            System.out.println("x= "+ resultado1);

            }else {
                //Muestro que la equacion no tiene solucion
                System.out.println("Raíces complejas");
            }
            //Pregunto si quiere continuar
          
                entrada.nextLine();
                System.out.print("¿Quieres continuar solucionando equaciones?");
                respuesta = entrada.nextLine();
                respuestac = respuesta.charAt(0);
                while(respuestac != 'S' && respuestac != 's'&& respuestac != 'N'&& respuestac != 'n') {
                    System.out.print("¿Quieres continuar solucionando equaciones?");
                    respuesta = entrada.nextLine();
                    respuestac = respuesta.charAt(0);
                }
        }
        entrada.close();
    }
}
