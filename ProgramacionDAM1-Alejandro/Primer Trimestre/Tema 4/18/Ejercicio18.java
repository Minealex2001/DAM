import java.util.Scanner;
public class Ejercicio18 { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        float horasTot, horasExt, tasaImp, tarifa, salarioTot, salarioNet, sal45;
        System.out.print("Escribe el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Escribe las horas totales: ");
        horasTot = entrada.nextFloat();
        System.out.print("Escribe la tasa: ");
        tarifa = entrada.nextFloat();

        if (horasTot > 35) {
            horasExt = horasTot - 35;
            salarioTot = (float) ((35 * tarifa) + (horasExt * (tarifa *1.5)));
            
        } else {
            salarioTot = 35 * tarifa;
        }
        if (salarioTot > 500) {
            if ( salarioTot > 900) {
                sal45 = (float) ((salarioTot - 900) * 0.55);
                salarioNet = sal45 + 300 + 500;
                tasaImp = salarioTot - salarioNet;

            }else {
                salarioNet = (float) (((salarioTot - 500) *0.75 ) + 500);
                tasaImp = salarioTot - salarioNet;
            }
        }else {
            salarioNet = salarioTot;
            tasaImp = 0;
        }
        System.out.println("El nombre es: " + nombre + ". Su salario total es: " + salarioTot + " , con unas tasas de: " + tasaImp + " . El salario total neto es de: " + salarioNet);
    }
}
