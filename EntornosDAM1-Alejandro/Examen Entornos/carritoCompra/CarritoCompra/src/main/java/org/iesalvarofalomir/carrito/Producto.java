package org.iesalvarofalomir.carrito;

/**
 * Clase Producto
 * @author Alejandro Sánchez Pinto
 * @version 1.0
 */

public class Producto {

    private String nombreProducto;
    private double precio;

    /**Establece el producto a partir de la cuenta. En caso contrario devuelve
     * @param nombreProducto - Nombre del Producto
     * @param precio - Precio del producto
    */ 
    public Producto(String nombreProducto, double precio) {

        // Puede ser negativo. Precio no puede ser negativo.
        if (precio < 0.0) {
            throw new IllegalArgumentException("Precio no puede ser negativo.");
        }

        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    /**
    * Devuelve el nombre del producto en la pantalla. This can be used to distinguish between productos that don't exist in the data source or are in a variety of places such as an organizacion.
    * 
    * 
    * @return Nombre del producto
    */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
    * Devuelve el precio de la matriz. Aqui se muestra el numero
    * @return El precio
    */
    public double getPrecio() {
        return precio;
    }

    /**
    * Compara si el producto es igual al inicio de la clase. Aqui se encuentra en caso de que la clase esta representado como parametro o objeto no tiene valor de la clase de producto a ser equivelimiento
    * 
    * @param obj - El objecto que desea
    * @return Si el objeto es igual
    */
    public boolean equals(Object obj) {
        
        boolean result = false;
        Producto p = (Producto) obj;
        
        // Devuelve true si el nombre de producto de la pelo producto
        if (p.getNombreProducto().equals(nombreProducto))
            result = true;
        
        return result;
    }
}
