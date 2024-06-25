import java.util.Scanner;
/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */
public class ejercicioObligatorio {
    public static void main(String[] args) {

        //Declaramos las variables que utilizaremos en el main y el Scanner
        Scanner entrada = new Scanner(System.in);
        double precio=0.0, precioPot=0.0, incre=0.0, kwTotal=0.0;
        String cont = "Continuar";

        //Realizamos un do-while para que el programa se este ejectuantdo mientras el usuario quiera.
        do{
        
        //Declaramos la variable donde almacenaremos el numero de contrato.
        //El numero de contrato lo pedimos desde el metodo.
        String numeroContrato = numContrato(entrada);

        //Declaramos la variable donde almacenaremos la potencia contratada.
        double potenciaCont = potenciaContratada(entrada);

        //Declaramos la variable donde almacenaremos los kW utilizados.
        double kwUtilizada = kwUtilizada(entrada);

        //Almacenamos el precio de la potencia contratada.
        precioPot = precioPotencia(potenciaCont, kwUtilizada);

        //Almacenamos el incremento por los kW utilizados.
        incre = incremento(precio, kwUtilizada);

        //Calculamos el precio total del cliente.
        precio = precioPot + incre;

        //Almacenamos los kW del cliente para el total de clientes.
        kwTotal = kwTotal + kwUtilizada;

        //Mostramos el resultado y preguntamos al usuario si quiere continuar el programa.
        cont = total(entrada, numeroContrato, potenciaCont, kwUtilizada, kwTotal, precio, incre, precioPot);
        }while(cont.equalsIgnoreCase("Continuar"));
    }

    //Metodo que devuelve un String con el numero de contrato.
    public static String numContrato(Scanner entrada) {

        //Preguntamos al usuario el numero del contrato.
        System.out.print("Hola, para comenzar, introduce tu numero de contrato con el formato 'ddd-dddd': ");
        String numero = entrada.nextLine();

        //Comprobamos que el numero del contrato conicide con el formato pedido
        while(numero.matches("-\\d[7]")){
            System.err.println("[ERROR] El formato introducido no es valido.");
            System.out.print("Introduce tu numero de contrato con el formato 'ddd-dddd': ");
            numero = entrada.nextLine();
        }
    return numero;
    }

    //Metodo que devuelve un double con la potencia contratada.
    public static double potenciaContratada(Scanner entrada) {

        //Preguntamos al usuario la potencia contratada.
        System.out.println("Ahora, introduce la potencia contratada:");
        double numero = entrada.nextDouble();

        //Comprobamos que el numero dado entra dentro de la potencia que disponemos
        while(numero!=3.45&&numero!=4.60&&numero!=5.75&&numero!=6.90&&numero!=8.05){
            System.err.println("[ERROR] La potencia contratada no es valida.");
            System.out.println("Introduce la potencia contratada:");
            numero = entrada.nextDouble();
        }
        return numero;
    }

    //Metodo que devuelve un double con los kW utilizados.
    public static double kwUtilizada(Scanner entrada) {

        //Preguntamos al usuario la potencia contratada.
        System.out.println("Ahora, introduce los kW utilizada en el utlimo mes:");
        double numero = entrada.nextDouble();

        //Comprobamos que el numero introduccido no es menor o igual a 0.
        while(numero<=0){
            System.err.println("[ERROR] El formato introducido no es valido.");
            System.out.println("Introduce los kW utilizada en el utlimo mes:");
            numero = entrada.nextDouble();
        }
        return numero;
    }

    //Metodo que devuelve un double con el precio por potencia.
    public static double precioPotencia(double potenciaCont, double kwUtilizada) {
        double numero=0.0;

        //Comprobamos la potencia indicada y le damos un precio.
        if(potenciaCont==3.45){
            numero = 10.23;
        }else if(potenciaCont==4.60){
            numero = 14.45;
        }else if(potenciaCont==5.75){
            numero = 15.69;
        }else if(potenciaCont==6.90){
            numero = 21.34;
        }else if(potenciaCont==8.05){
            numero = 25.99;
        }
        return numero;
    }

    //Metodo que devuelve un double con el incremento por kW.
    public static double incremento(double precio,double kwUtilizada) {
        double numero = 0.0;

        //Comprobamos los kW indicados y le damos el incremento.
        if(kwUtilizada>=0&&kwUtilizada<=150){
            numero = (kwUtilizada * 0.1684);
        }else if(kwUtilizada>150&&kwUtilizada<=300){
            numero = ((kwUtilizada * 0.1684)*1.05);
        }else if(kwUtilizada>300&&kwUtilizada<=400){
            numero = ((kwUtilizada * 0.1684)*1.08);
        }else{
            numero = ((kwUtilizada * 0.1684)*1.12);
        }
        return numero;
    }

    //Metodo que devuelve un String con la respuesta al usuario si quiere continuar.
    public static String total(Scanner entrada, String numeroContrato, double potenciaCont, double kwUtilizada, double kwTotal, double precio, double incre, double precioPot) {

        //Mostramos los resultados.
        System.out.println("El numero de contrato es: " + numeroContrato);
        System.out.println("La potencia contratada es: " + potenciaCont);
        System.out.println("Los kW utilizados son: " + kwUtilizada);
        System.out.println("El precio base es de: " + precioPot + " más el incremento de por los kW utilizados: " + incre);
        System.out.println("El total es: " + precio);
        System.out.println("kW utilizados por los clientes: " + kwTotal);

        //Preguntamos al usuario si quiere continuar.
        System.out.println("¿Quieres continuar? Escribe Continuar si es asi, si no escribe Salir");
        entrada.nextLine();
        String cont = entrada.nextLine();

        return cont;
    }
}