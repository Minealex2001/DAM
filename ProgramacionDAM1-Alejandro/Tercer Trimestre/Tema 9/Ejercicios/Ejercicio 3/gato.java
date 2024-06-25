public class gato extends mascotas {
    
    private String color;
    private boolean peloLargo;
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     * @param color
     * @param peloLargo
     */
    public gato(String nombre, String estado, String fechaNacimiento, int edad, String color, boolean peloLargo) {
        super(nombre, estado, fechaNacimiento, edad);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return the peloLargo
     */
    public boolean isPeloLargo() {
        return peloLargo;
    }

    @Override
    public void muestra() {
        System.out.print("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado: " + super.getEstado());
        System.out.println("Fecha de Nacimiento: " + super.getFechaNacimiento());
        System.out.println("Color: " + getColor());
        System.out.println("Pelo largo: " + isPeloLargo());
    }
    
}
