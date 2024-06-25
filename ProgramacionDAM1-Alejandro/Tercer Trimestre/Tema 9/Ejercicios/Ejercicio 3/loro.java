public class loro extends aves {
    
    private String origen;
    private boolean habla;
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     * @param pico
     * @param vuela
     * @param origen
     * @param habla
     */
    public loro(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela,
            String origen, boolean habla) {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    

    @Override
    public void muestra() {
        System.out.print("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado: " + super.getEstado());
        System.out.println("Fecha de Nacimiento: " + super.getFechaNacimiento());
        System.out.println("Pico: " + super.getPico());
        System.out.println("Vuela: " + super.isVuela());
        System.out.println("Origen: " + getOrigen());
        System.out.println("Habla: " + isHabla());
}


    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }


    /**
     * @return the habla
     */
    public boolean isHabla() {
        return habla;
    }

    @Override
    public void volar() {
        if(super.isVuela()){
            System.out.println("El loro si que vuela.");
        }else {
            System.out.println("El loro no vuela.");
        }
    }
}
