import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seguir = 1;
        do{
        //Pregunto de que pais es
        System.out.print("¿De que pais eres? Escribe 'Japon' o 'Espana'");
        String pais = entrada.nextLine();
        String diasemana="Lunes";
        int hora=1, minutos=1;
            //Segun el pais voy a un caso distinto
            switch (pais){

                case "Japon":
                    //Pregunto que dia de la semana es, que hora y que dia
                    System.out.print("¿Que dia de la semana es? ");
                    diasemana = entrada.nextLine();
                    System.out.print("¿Que hora es? ");
                    hora = entrada.nextInt();
                    System.out.print("¿Que minutos son? ");
                    minutos = entrada.nextInt();
                    //Dependiendo del dia de la semana voy a un caso distinto
                    switch (diasemana){
                        case "Lunes":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Domingo";
                        }
                        break;
                        case "Martes":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;
                        case "Miercoles":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;
                        case "Jueves":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;
                        case "Viernes":
                            hora = hora - 8;
                            if(hora <= 0){
                                hora = 23;
                                diasemana = "Lunes";
                            }
                        break;
                        case "Sabado":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;
                        case "Domingo":
                        hora = hora - 8;
                        if(hora <= 0){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;

                case "Espana":
                    //Pregunto que dia de la semana es, que hora y que dia
                    System.out.print("¿Que dia de la semana es? ");
                    diasemana = entrada.nextLine();
                    System.out.print("¿Que hora es? ");
                    hora = entrada.nextInt();
                    System.out.print("¿Que minutos son? ");
                    minutos = entrada.nextInt();
                    //Dependiendo del dia de la semana voy a un caso distinto
                    switch (diasemana){
                        case "Lunes":
                        hora = hora + 8;
                        if(hora >= 24){
                            hora = 00;
                            diasemana = "Martes";
                        }
                        break;
                        case "Martes":
                        hora = hora + 8;
                        if(hora >= 24){
                            hora = 00;
                            diasemana = "Miercoles";
                        }
                        break;
                        case "Miercoles":
                        hora = hora + 8;
                        if(hora <= 24){
                            hora = 00;
                            diasemana = "Jueves";
                        }
                        break;
                        case "Jueves":
                        hora = hora + 8;
                        if(hora <= 24){
                            hora = 00;
                            diasemana = "Viernes";
                        }
                        break;
                        case "Viernes":
                        hora = hora + 8;
                        if(hora >= 24){
                            hora = 00;
                            diasemana = "Sabado";
                        }
                        break;
                        case "Sabado":
                        hora = hora + 8;
                        if(hora >= 24){
                            hora = 00;
                            diasemana = "Domingo";
                        }
                        break;
                        case "Domingo":
                        hora = hora + 8;
                        if(hora >= 24){
                            hora = 23;
                            diasemana = "Lunes";
                        }
                        break;
                }
            }

        }
    //Muestro el resultado
    System.out.println("La fecha es:" + diasemana + " " + hora + ":"+ minutos);
    //Pregunto si quiere continuar
    System.out.print("¿Quieres continuar?");
    seguir = entrada.nextInt();
    entrada.close();
    }while(seguir == 1);

    }
}
