package programacion.obligatorio;
/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */
public class Cuenta {

    /**
     * Creamos las variables privadas del objeto.
     * final String numeroCuenta = almacena el numero de la cuenta del usuario.
     * double saldoDisponible = almacena el saldo que tiene la cuenta disponible.
     */
    private final String numeroCuenta;
    private double saldoDisponible;

    //Constructor del objeto.
    public Cuenta(String numeroCuenta, double saldoDisponible) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
    }
    
    //Metodo para obtener el numero de cuenta.
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    //Metodo para obtener el saldo disponible.
    public double getSaldoDisponible() {
        return saldoDisponible;
    }


    //Metodo para añadir dinero a la cuenta.
    public void abonar(double cantidad) {
        saldoDisponible += cantidad;
    }
    
    //Metodo para quitar dinero de la cuenta.
    public void pagar(double cantidad) {

        //Comprobamos si la cuenta tiene saldo disponible para realizar la transaccion.
        if (saldoDisponible >= cantidad) {
            saldoDisponible -= cantidad;
        }
    }
}
    
