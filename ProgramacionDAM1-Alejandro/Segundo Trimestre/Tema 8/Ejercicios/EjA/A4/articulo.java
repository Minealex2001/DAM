package EjA.A4;

class Articulo {
    String nombre;
    double precioSinIVA;
    double iva = 21;
    int cuantosQuedan;
    
    public Articulo(String nombre, double precioSinIVA, int cuantosQuedan) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public double getPrecioConIVA() {
        return precioSinIVA + (precioSinIVA * iva / 100);
    }
}
