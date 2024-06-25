public class canario extends aves {

    private String color;
    private boolean canta;
  
    /**
     * @param nombre
     * @param estado
     * @param fechaNacimiento
     * @param edad
     * @param pico
     * @param vuela
     * @param color
     * @param canta
     */
    public canario(String nombre, String estado, String fechaNacimiento, int edad, String pico, boolean vuela,
            String color, boolean canta) {
        super(nombre, estado, fechaNacimiento, edad, pico, vuela);
        this.color = color;
        this.canta = canta;
    }



    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }



    /**
     * @return the canta
     */
    public boolean isCanta() {
        return canta;
    }



    @Override
    public void muestra() {
        System.out.print("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado: " + super.getEstado());
        System.out.println("Fecha de Nacimiento: " + super.getFechaNacimiento());
        System.out.println("Pico: " + super.getPico());
        System.out.println("Vuela: " + super.isVuela());
        System.out.println("Color: " + getColor());
        System.out.println("Canta: " + isCanta());
    }



    @Override
    public void volar() {
        if(super.isVuela()){
            System.out.println("El canario si que vuela.");
        }else {
            System.out.println("El canario no vuela.");
        }
    }
}
