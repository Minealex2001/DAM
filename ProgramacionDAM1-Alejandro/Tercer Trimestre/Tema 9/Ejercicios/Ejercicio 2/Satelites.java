public class Satelites extends Astros {
    
    private double distancia_planeta;
    private String planeta;
    /**
     * @param radio
     * @param masa
     * @param gravedad
     * @param rotacion
     * @param translacion
     * @param distancia_planeta
     * @param planeta
     */
    public Satelites(double radio, double masa, double gravedad, int rotacion, int translacion,
            double distancia_planeta, String planeta) {
        super(radio, masa, gravedad, rotacion, translacion);
        this.distancia_planeta = distancia_planeta;
        this.planeta = planeta;
    }
    /**
     * @return the distancia_planeta
     */
    public double getDistancia_planeta() {
        return distancia_planeta;
    }
    /**
     * @return the planeta
     */
    public String getPlaneta() {
        return planeta;
    }
    
    public void muestra(){
        super.mostrar();
        System.out.println("Distancia del planeta: "+ getDistancia_planeta());
        System.out.println("Planeta al que pertenece: "+ getPlaneta());
    }
}
