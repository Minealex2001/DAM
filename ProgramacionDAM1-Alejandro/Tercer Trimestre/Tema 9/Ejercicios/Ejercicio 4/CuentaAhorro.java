public class CuentaAhorro extends CuentaBancaria {
    private int saldoMinimo;

    /**
     * @param iban
     * @param saldo
     * @param interesAnualBasico
     * @param saldoMinimo
     */
    public CuentaAhorro(String iban, int saldo, float interesAnualBasico, int saldoMinimo) {
        super(iban, saldo, interesAnualBasico);
        this.saldoMinimo = saldoMinimo;
    }
    
    
}
