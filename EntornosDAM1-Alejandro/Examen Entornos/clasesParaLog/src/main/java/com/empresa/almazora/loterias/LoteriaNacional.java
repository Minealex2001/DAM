package com.empresa.almazora.loterias;

import com.empresa.almazora.auxiliar.ClaseAuxiliarLoteria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoteriaNacional {

    private static final Logger log = LogManager.getLogger(LoteriaNacional.class);
    public LoteriaNacional() {
        // TODO Auto-generated constructor stub
    }

    //En este metodo de clase resolveremos el problema de la Loteria Nacional
    public double juegaLoteriaNacional() throws IOException {

        log.trace("Inicio del método {juegaLoteriaNacional}");
        log.info("Inicio del método {juegaLoteriaNacional}");
        log.warn("Inicio del método {juegaLoteriaNacional}");
        log.error("Incio del método {juegaLoteriaNacional}");
        
        String fechacadena = ClaseAuxiliarLoteria.dia_del_sorteo(3).toString();
        System.out.println("Proximo Sorteo :" + fechacadena);
        System.out.println("Elige la terminacion hasta 3 cifras: (ENTER si te da igual):");
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        texto = teclado.readLine();
        int numero;
        // En caso de ser ENTER, todos los numeros, controlo si ya ha aparecido, numeros hasta el 70000
        if (texto.isEmpty()) {

            numero = (int) Math.floor(Math.random() * 70000 + 1);
            System.out.println("Numero con el que juegas: " + numero);
        } else {
            // Comprobamos cuantos digitos ha metido
            if (texto.length() == 3) {
                String numeroconstruido;
                int numero1, numero2;
                numero1 = (int) (Math.floor(Math.random() * 9));
                numero2 = (int) (Math.floor(Math.random() * 9));
                numeroconstruido = Integer.toString(numero1) + Integer.toString(numero2) + texto;
                System.out.println("Numero con el que juegas: " + numeroconstruido);
            }
            if (texto.length() == 2) {
                String numeroconstruido;
                int numero1, numero2, numero3;
                numero1 = (int) (Math.floor(Math.random() * 9));
                numero2 = (int) (Math.floor(Math.random() * 9));
                numero3 = (int) (Math.floor(Math.random() * 9));
                numeroconstruido = Integer.toString(numero1) + Integer.toString(numero2) + Integer.toString(numero3) + texto;
                System.out.println("Numero con el que juegas: " + numeroconstruido);
            }
            if (texto.length() == 1) {
                String numeroconstruido;
                int numero1, numero2, numero3, numero4;
                numero1 = (int) (Math.floor(Math.random() * 9));
                numero2 = (int) (Math.floor(Math.random() * 9));
                numero3 = (int) (Math.floor(Math.random() * 9));
                numero4 = (int) (Math.floor(Math.random() * 9));
                numeroconstruido = Integer.toString(numero1) + Integer.toString(numero2) + Integer.toString(numero3) + Integer.toString(numero4) + texto;
                System.out.println("Numero con el que juegas: " + numeroconstruido);

            }
        }
        ClaseAuxiliarLoteria.tecla_para_continuar();
        return 12;
    }

}
