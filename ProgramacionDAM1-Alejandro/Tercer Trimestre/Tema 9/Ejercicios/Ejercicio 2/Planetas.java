public class Planetas extends Astros{
    
    private double distancia_sol;
    private boolean tieneSatelites;
    /**
     * @param radio
     * @param masa
     * @param gravedad
     * @param rotacion
     * @param translacion
     * @param distancia_sol
     * @param tieneSatelites
     */
    public Planetas(double radio, double masa, double gravedad, int rotacion, int translacion, double distancia_sol,
            boolean tieneSatelites) {
        super(radio, masa, gravedad, rotacion, translacion);
        this.distancia_sol = distancia_sol;
        this.tieneSatelites = tieneSatelites;
    }

    /**
     * @return the distancia_sol
     */
    public double getDistancia_sol() {
        return distancia_sol;
    }

    /**
     * @return the tieneSatelites
     */
    public boolean isTieneSatelites() {
        return tieneSatelites;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Distancia del sol: "+ getDistancia_sol());
        System.out.println("Tiene Satelites: "+ isTieneSatelites());
    }
}