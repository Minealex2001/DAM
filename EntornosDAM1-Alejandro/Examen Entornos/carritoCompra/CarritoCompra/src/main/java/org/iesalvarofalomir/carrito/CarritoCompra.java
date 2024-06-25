package org.iesalvarofalomir.carrito;

import java.util.*;
/**
 * Clase CarritoCompra
 * @author Alejandro Sánchez Pinto
 * @version 1.0
 */
public class CarritoCompra {

    private ArrayList<Producto> productos;

    /**
     * Constructor
     */
    public CarritoCompra() {
        productos = new ArrayList<Producto>();
    }

    /**
    * Devuelve el precio suma de productos inicializados en la pantalla
    * @return El precio total
    */
    public double getPrecioTotal() {
        double precioTotal = 0.00;
        for (Producto item: productos) {
           
            precioTotal += item.getPrecio();
        }
        return precioTotal;
    }

    /**
    * Agrega un Producto a la lista de Productos. No se encuentra en el objeto Producto que se va a agregar
    * 
    * @param item - El Producto a agregar
    */
    public void agregaProducto(Producto item) {
        productos.add(item);
    }
    
    /**
    * Metodo que agrega un Producto.
    * 
    * @param item - Objeto que contiene la informacion
    */
    @Deprecated
    public void agregaProductoOld(Producto item) {
        System.out.println("Metodo deprecated");
    }

    /**
    * Borra un producto en la lista de productos. Si no existe devuelve un exception
    * 
    * @param item - Item que se quiere borra una
    * @exception ProductNotFoundException se llama al otro class
    */
    public void borraProducto(Producto item) throws ProductNotFoundException {
        // Remove the product from the productos list.
        if (!productos.remove(item)) {
            throw new ProductNotFoundException();
        }
    }

    /**
    * Devuelve el numero de productos cantidad en la tabla de productos
    * @return La cantidad de productos
    */
    public int getCantidadProductos() {
        return productos.size();
    }

    /**
    * Metodo que vacia el carrito de la ventana de productos. Cuando se hace en caso de que no existen los productos
    */
    public void vaciarCarrito() {
        productos.clear();
    }
}
