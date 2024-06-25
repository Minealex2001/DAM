public class perro extends mascotas {
    
    private String raza;
    private boolean pulgas;
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     * @param raza
     * @param pulgas
     */
    public perro(String nombre, String estado, String fechaNacimiento, int edad, String raza, boolean pulgas) {
        super(nombre, estado, fechaNacimiento, edad);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }


    /**
     * @return the pulgas
     */
    public boolean isPulgas() {
        return pulgas;
    }


    @Override
    public void muestra() {
        System.out.print("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado: " + super.getEstado());
        System.out.println("Fecha de Nacimiento: " + super.getFechaNacimiento());
        System.out.println("Raza: " + getRaza());
        System.out.println("Pulgas: " + isPulgas());
    }

    
}
