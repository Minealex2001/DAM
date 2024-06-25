import java.util.Scanner;

public class EjercicioObligatorio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dia, mes, any;
        //Declaro unas variables que usare como interruptor
        boolean paresbien=false, imparesbien=false, febbien=false, fechaerr=false, dicbien=false ;
        /*
         * paresbien = meses de 31 dias
         * imparesbien = meses de 30 dias
         * febbien = mes de febrero
         * fechaerr = fecha erronea
         * dicbien = mes de diciembre
         */
        //Leemos la fecha a utilizar
        System.out.print("Escribe un dia: ");
        dia = entrada.nextInt();

        System.out.print("Escribe un mes (en numero): ");
        mes = entrada.nextInt();

        System.out.print("Escribe un año: ");
        any = entrada.nextInt();

        //Comprobamos si la fecha indicada es correcta en los meses de 31 dias

        if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if ( dia >= 1 && dia <= 31 ) {
                if (mes == 12) {
                    //Comporbamos que el mes es 12, ya que la suma es diferente
                    dicbien = true;
                } else {
                    paresbien = true;
                }
            }
        //Comporbamos si la fecha indicada es correcta en los meses de 30 dias
        }else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            if ( dia >= 1 && dia <= 30) {
                imparesbien = true;
            }
        //Comporbamos si la fecha indicada es correcta en febrero
        }else if ( mes == 2) {
            if ( dia >= 1 && dia <= 28) {
                febbien = true;
            }
        } else {
            fechaerr = true;
        }
        //Print de control (usado solo para ver si el interruptor y las condiciones funcionan)
        //System.out.println(fechaerr + "" + paresbien + "" + imparesbien + "" + febbien + "" + dicbien);

        //Se realiza la suma de los 7 dias en los meses de 31 dias.
        if (paresbien) {
            //Compruebo si los dias estan entre 1 y 24 ya que, entre 25 y 31 la suma de 7 dias hacen que cambies de mes
            if (dia >= 1 && dia <= 24) {
                dia = dia + 7;
            }else {
                dia = (dia + 7) - 31;
                mes++;
            }
            //Se realiza la suma de los 7 dias en los meses de 30 dias.
        }else if (imparesbien) {
            //Compruebo si los dias estan entre 1 y 24 ya que, entre 25 y 31 la suma de 7 dias hacen que cambies de mes
            if (dia >= 1 && dia <= 23) {
                dia = dia + 7;
            }else {
                dia = (dia + 7) - 30;
                mes++;
            }
            //Se realiza la suma de los 7 dias en el mes de febrero
        }else if (febbien) {
            //Compruebo si los dias estan entre 1 y 21 ya que, entre 22 y 28 la suma de 7 dias hacen que cambies de mes
            if (dia >= 1 && dia <= 21) {
                dia = dia + 7;
            }else {
                dia = (dia + 7) - 28;
                mes++;
            }
        }else if (dicbien) {
            //Se realiza la suma de los 7 dias en el mes de diciembre
            if (dia >= 1 && dia <= 24) {
                //Compruebo si los dias estan entre 1 y 24 ya que, entre 25 y 31 la suma de 7 dias reinicia el mes y cambia del año 
                dia = dia + 7;
            }else {
                dia = (dia + 7) - 31;
                mes = 1;
                any++;
            }
        }

        if (fechaerr) {
            System.err.println("La fecha " + dia + " de " + mes + " del " + any + " es incorrecta");
        }else {
            System.out.println("La fecha es " + dia + " del " + mes + " de " + any + " .");
        }
        entrada.close();
    }
}