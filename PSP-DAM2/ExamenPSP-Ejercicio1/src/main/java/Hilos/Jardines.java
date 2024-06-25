package Hilos;

/**
 * Jardines class
 */
public class Jardines {
    //Atributos
    private final boolean[] jardines = new boolean[10];

    /**
     * Constructor
     */
    public Jardines() {
        for (int i = 0; i < 10; i++) {
            jardines[i] = true;
        }
    }

    //Metodos
    public synchronized int trabajar(){
        int i = 0;
        //Busco un jardin que este libre
        do {
            i = (int) (Math.random() * 10);
        }while (!jardines[i]);
        //Marco el jardin como ocupado
        jardines[i] = true;
        //Devuelvo el jardin
        return i;
    }

    public synchronized void terminar(int i){
        //Marco el jardin como libre
        //Este metodo genera un error en el que un jardinero puede terminar de trabajar en un jardin que no ha trabajado
        //Lo he dejado de esta forma porque impidiendo que un jardinero termine de trabajar en un jardin que no ha trabajado
        //el programa se congela.
        if (!jardines[i]) {
            jardines[i] = false;
        }
    }

}
