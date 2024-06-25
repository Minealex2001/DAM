package Hilos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

//Lombok annotations
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor

/**
 * Jardineros class
 */
public class Jardineros extends Thread{
    //Atributos
    Jardines jardines;
    int trabajado = 0;

    /**
     * Constructor
     * @param jardines
     */
    public Jardineros(Jardines jardines){
        this.jardines = jardines;
    }

    /**
     * Metodo run
     */
    @Override
    public void run() {
        int i = 0;
        long tiempo = System.currentTimeMillis();
        //Mientras no hayan pasado 30 segundos
        while (System.currentTimeMillis() - tiempo  < 30000L){
            //Trabajo en un jardin
            i = jardines.trabajar();
            System.out.println("Jardinero " + this.getName() + " trabajando en el jardín " + i);
            //Duermo el hilo 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupcion del hilo:  " + this.getName());
            }
            //Termino de trabajar en el jardin
            jardines.terminar(i);
            System.out.println("Jardinero " + this.getName() + " terminó de trabajar en el jardín " + i);
            trabajado++;
        }
    }
}
