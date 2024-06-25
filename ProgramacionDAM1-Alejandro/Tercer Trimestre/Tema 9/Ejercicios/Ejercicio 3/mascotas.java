public abstract class mascotas {
    private String nombre, estado, fechaNacimiento;
    private int edad;
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     */
    public mascotas(String nombre, String estado, String fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public abstract void muestra();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
