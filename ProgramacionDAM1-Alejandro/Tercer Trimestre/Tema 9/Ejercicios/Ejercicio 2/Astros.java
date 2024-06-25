
public class Astros {

    private double radio, masa, gravedad;
    private int rotacion, translacion;
    /**
     * @param radio
     * @param masa
     * @param gravedad
     * @param rotacion
     * @param translacion
     */
    public Astros(double radio, double masa, double gravedad, int rotacion, int translacion) {
        this.radio = radio;
        this.masa = masa;
        this.gravedad = gravedad;
        this.rotacion = rotacion;
        this.translacion = translacion;
    }
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * @return the masa
     */
    public double getMasa() {
        return masa;
    }
    /**
     * @return the gravedad
     */
    public double getGravedad() {
        return gravedad;
    }
    /**
     * @return the rotacion
     */
    public int getRotacion() {
        return rotacion;
    }
    /**
     * @return the translacion
     */
    public int getTranslacion() {
        return translacion;
    }

    public void mostrar(){
        System.out.println("Radio: "+ getRadio());
        System.out.println("Masa: "+ getMasa());
        System.out.println("Gravedad: " + getGravedad());
        System.out.println("Rotacion: "+ getRotacion());
        System.out.println("Translacion: "+ getTranslacion());
    }

}
