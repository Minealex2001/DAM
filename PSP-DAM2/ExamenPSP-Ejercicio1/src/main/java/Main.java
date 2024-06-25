import Hilos.Jardineros;
import Hilos.Jardines;

/**
 * Main class
 */
public class Main {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        //Creo un objeto de la clase Jardines
        Jardines jardines = new Jardines();
        //Creo un array de 3 jardineros
        Jardineros[] jardineros = new Jardineros[3];

        //Inicializo los jardineros
        for (int i = 0; i < jardineros.length; i++) {
            jardineros[i] = new Jardineros(jardines);
            jardineros[i].start();
            //Le asigno un nombre a cada jardinero
            jardineros[i].setName(String.valueOf(i));
        }

        //Espero a que terminen los hilos
        for (Jardineros value : jardineros) {
            try {
                value.join();
            } catch (InterruptedException e) {
                System.err.println("Interrupcion del hilo:  " + value.getName());
            }
        }

        //Muestro el número de veces que ha trabajado cada jardinero
        for (Jardineros jardinero : jardineros) {
            System.out.println("El jardinero " + jardinero.getId() + " ha trabajado " + jardinero.getTrabajado() + "veces distintas.");
        }
    }
}
