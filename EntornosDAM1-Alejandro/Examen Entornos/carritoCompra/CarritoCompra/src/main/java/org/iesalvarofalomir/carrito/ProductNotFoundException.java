package org.iesalvarofalomir.carrito;

/**
 * Excepcion
 * @author Alejandro Sánchez Pinto
 * @version 1.0
 */

public class ProductNotFoundException extends Exception {

    /** Devuelve nulo si no se encuentra producto
     * */ 
    public ProductNotFoundException() {
        super();
    }
}
