public abstract class CuentaBancaria {
    private String iban;
    private int saldo;
    private final float interesAnualBasico;
    

    /**
     * @param iban
     * @param saldo
     * @param interesAnualBasico
     */
    public CuentaBancaria(String iban, int saldo, float interesAnualBasico) {
        this.iban = iban;
        this.saldo = saldo;
        this.interesAnualBasico = interesAnualBasico;
    }

    public abstract void calcularintereses();

    /**
     * @return the iban
     */
    public String getIban() {
        return iban;
    }
    
    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    public void ingresar(int dinero){
        saldo = saldo + dinero;
    } 

    public void retirar(int dinero){
        saldo = saldo - dinero;
    }
}
