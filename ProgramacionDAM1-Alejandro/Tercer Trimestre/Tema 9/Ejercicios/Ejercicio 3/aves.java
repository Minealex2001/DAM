public abstract class aves extends mascotas {
    
    private String pico;
    private boolean vuela;
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     * @param pico
     * @param vuela
     */
    public aves(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela) {
        super(nombre, estado, fechaNacimiento, edad);
        this.pico = pico;
        this.vuela = vuela;
    }

    
    /**
     * @return the pico
     */
    public String getPico() {
        return pico;
    }


    /**
     * @return the vuela
     */
    public boolean isVuela() {
        return vuela;
    }


    public abstract void volar();
}
