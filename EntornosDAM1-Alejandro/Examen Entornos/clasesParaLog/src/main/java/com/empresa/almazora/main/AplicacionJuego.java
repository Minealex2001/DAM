package com.empresa.almazora.main;

import com.empresa.almazora.auxiliar.ClaseAuxiliarLoteria;
import com.empresa.almazora.loterias.LoteriaNacional;
import com.empresa.almazora.loterias.Primitiva;
import com.empresa.almazora.loterias.Quiniela;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AplicacionJuego {

    private static double totalApuestas = 0;
    private static final Logger log = LogManager.getLogger(AplicacionJuego.class);
    public static void main(String[] args) {
        try {
            ClaseAuxiliarLoteria mijuego = new ClaseAuxiliarLoteria();
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String texto = "";
            char opcion = ' ';
            log.trace("Inicio del método {main}");
            log.info("Inicio del método {main}");
            log.warn("Inicio del método {main}");
            log.error("Incio del método {main}");
            do {

                System.out.println("**********************");
                System.out.println("LOTERIAS Y APUESTAS");
                System.out.println("**********************");
                System.out.println("1 - Primitiva.");
                System.out.println("2 - Quiniela.");
                System.out.println("3 - Loteria Nacional");
                System.out.println("0 - Salir");
                System.out.println("\nElige juego:");
                texto = teclado.readLine();
                opcion = texto.charAt(0);
                if (opcion == '1') {
                    //Llamo al metodo juego de la Primitiva 
                    Primitiva primitiva = new Primitiva();
                    totalApuestas += primitiva.juegaPrimitiva();
                }
                if (opcion == '2') {
                    //Llamo al metodo juego de la Quiniela
                    Quiniela quiniela = new Quiniela();
                    totalApuestas += quiniela.juegaQuiniela();
                }
                if (opcion == '3') {
                    //Llamo al metodo juego de la Loteria Nacional
                    LoteriaNacional loteriaNacional = new LoteriaNacional();
                    totalApuestas += loteriaNacional.juegaLoteriaNacional();
                }

            } while (opcion != '0');

            // Mostramos el total mediante la variable de clase tipo static (no se han instanciado objetos.
            System.out.println("........................");
            System.out.println("Total a Pagar: " + Double.toString(totalApuestas) + " Euros");

        } catch (IOException ex) {
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }
    }
}
