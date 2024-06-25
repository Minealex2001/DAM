public class CuentaCorriente extends CuentaBancaria {

    /**
     * @param iban
     * @param saldo
     * @param interesAnualBasico
     */
    public CuentaCorriente(String iban, int saldo, float interesAnualBasico) {
        super(iban, saldo, interesAnualBasico);
    }
    
}
