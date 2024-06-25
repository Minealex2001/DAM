package es.clase.principal;

import es.google.acciones.Acciones;
import org.iesalvarofalomir.mov.Movimiento;
import org.nasa.Persona;

/**
 *
 * @author pablo
 */
public class ClasePrincipal {

    public static void main(String[] args){
        
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setApellidos("Lopez");
        
        Movimiento.arriba();
        Movimiento.abajo();
        Acciones.salta();
        Acciones.corre();
        Acciones.vuela();
    }
}
