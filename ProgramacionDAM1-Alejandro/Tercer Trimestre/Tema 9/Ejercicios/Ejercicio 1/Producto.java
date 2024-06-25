public class Producto{

    private int cantidad;
    private String nombre;
    /**
     * @param cantidad
     * @param nombre
     */
    public Producto(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + cantidad;
    }
    
}