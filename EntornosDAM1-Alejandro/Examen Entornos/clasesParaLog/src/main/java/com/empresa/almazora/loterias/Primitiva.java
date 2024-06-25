package com.empresa.almazora.loterias;

import com.empresa.almazora.auxiliar.ClaseAuxiliarLoteria;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Primitiva {

    private static final Logger log = LogManager.getLogger(Primitiva.class);
    public Primitiva() {
        // TODO Auto-generated constructor stub
    }

    public double juegaPrimitiva() throws IOException {//En este metodo de clase resolveremos el problema de la Primitiva   
        
        log.trace("Inicio del método {juegaPrimitiva}");
        log.info("Inicio del método {juegaPrimitiva}");
        log.warn("Inicio del método {juegaPrimitiva}");
        log.error("Incio del método {juegaPrimitiva}");

        String fechacadena = ClaseAuxiliarLoteria.dia_del_sorteo(1).toString();
        // Seguimos con lo que pide el enunciado.
        System.out.println("Proximo Sorteo :" + fechacadena);
        int NumerosPrimitiva;

        //inicializamos los numeros del array
        System.out.print("Apuesta: ");
        for (int i = 0; i <= 7; i++) {
            NumerosPrimitiva = (int) Math.floor(Math.random() * 49 + 1);
            if (i < 6) {
                System.out.print(Integer.toString(NumerosPrimitiva) + " ");
            }
            if (i == 6) // Para el complementario
            {
                System.out.println("\nComplementario:" + Integer.toString(NumerosPrimitiva) + " ");
            }
            if (i == 7) {
                NumerosPrimitiva = (int) Math.floor(Math.random() * 9);
                System.out.print("Reintegro:" + Integer.toString(NumerosPrimitiva) + " ");
            }
        }
        // Sumamos el coste de la apuesta
        ClaseAuxiliarLoteria.tecla_para_continuar();
        return 1;

    }

}
