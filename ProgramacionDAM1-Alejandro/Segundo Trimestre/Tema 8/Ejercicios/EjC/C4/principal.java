package EjC.C4;

public class principal {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("Pijama", 10, 5);
        
        System.out.println(articulo.nombre + " - Precio:" + articulo.precioSinIVA + "€ - IVA:" + articulo.iva + "% - PVP:" + articulo.getPrecioConIVA() + "€");
        
        articulo.precioSinIVA = 12;
        
        System.out.println(articulo.nombre + " - Precio:" + articulo.precioSinIVA + "€ - IVA:" + articulo.iva + "% - PVP:" + articulo.getPrecioConIVA() + "€");
    }
}
