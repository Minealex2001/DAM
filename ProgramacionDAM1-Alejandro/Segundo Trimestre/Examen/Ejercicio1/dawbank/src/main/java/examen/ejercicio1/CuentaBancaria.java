package examen.ejercicio1;

/*
 * Examen Segunda Evaluacion Ejercicio 1
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class CuentaBancaria{
    /*
     * Creamos las variables necesarias para crear una cuenta bancaria correctamente.
     * -final String iban = para almacenar el numero de cuenta.
     * -final String nombre = para almacenar el nombre del titular.
     * -double saldo = almacenara el saldo que tiene la cuenta.
     * -String movimientos[] = almacenara los primeros 100 movimientos de la cuenta.
     * -in controlMovimientos = es la encargada de controlar en que posicion del array se añadira el movimiento
     */
    private final String iban, nombre;
    private double saldo = 0;
    private String movimientos[] = new String[100];
    private int controlMovimientos = 0;

    //Creamos el constructor del objeto con las variables necesarias
    public CuentaBancaria(String iban, String nombre) {
        this.iban = iban;
        this.nombre = nombre;
    }

    /**
     * @return  iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return movimientos
     */
    public String getMovimientos(int i) {
        return movimientos[i];
    }

    /**
     * @return the controlMovimientos
     */
    public int getControlMovimientos() {
        return controlMovimientos;
    }

    /**
     * @param controlMovimientos the controlMovimientos to set
     */
    public void setControlMovimientos(int controlMovimientos) {
        this.controlMovimientos = controlMovimientos;
    }

    //Metodo que se utilizara para ingresar dinero en la cuenta.
    public boolean ingreso(double dinero){

        //Esta variable es la que devolvera el metodo para relaizar posteriormente una accion.
        boolean control = false;
        //Compruebo que la transaccion que se lleva a cabo es positiva
        if(dinero > 0){
            setSaldo(getSaldo() + dinero);
            movimientosAdd(dinero);
            control = true;
        }
        
        return control;
    }

    //Metodo que se realizara para retirar dinero de la cuenta.
    public boolean retirada(double dinero){

        //Esta es una variable de control para verificar que el saldo que se queda despues de realizar la transaccion no sea inferior a los -50€.
        double control = getSaldo();

        //Esta variable es la que devolvera el metodo para relaizar posteriormente una accion.
        boolean vuelta = false;

        //Compruebo que la transaccion que se lleva a cabo es positiva
        if(dinero > 0){

            //Resto el dinero que se quiere retrirar a la variable de controlo
            control -= dinero;

            //Compruebo que el saldo este entre 0 y -50.
            if(control < 0 && control > -50){
                System.err.println("[AVISO] Saldo negativo en cuenta");
                setSaldo(getSaldo()-dinero);
                movimientosEl(dinero);
                vuelta = true;

            //Compruebo si la transaccion es superior a los 3000€, asi como si el saldo final de la cuenta se queda por debajo del limite.
            }else if(dinero > 3000 && control < -3000 && control < 0){
                System.err.println("[AVISO] Notificar a Hacienda");
            }else{

                //Si los dos casos anteriores dan falso, entonces realizo transaccion sin ningun problema.
                setSaldo(getSaldo()-dinero);
                movimientosEl(dinero);
                vuelta = true;
            }
        }
        return vuelta;
    }
    
    //Metodo privado que se llamara para añadir al array de movimientos que tipo de accion se ha realizado. En este caso ingreso
    private void movimientosAdd(double dinero){

        //Compruebo si la variable de control ha llegado a su limite, si es asi, se reinicia a 0 y comenzará a sobrescribir.
        if(controlMovimientos == movimientos.length){
            setControlMovimientos(0);
        }
        //Añado el movimiento.
        movimientos[controlMovimientos] = "Se ha añadido " + dinero + "a la cuenta.";
        setControlMovimientos(getControlMovimientos()+1);
    }

    //Metodo privado que se llamara para añadir al array de movimientos que tipo de accion se ha realizado. En este caso retirada
    private void movimientosEl(double dinero){

        //Compruebo si la variable de control ha llegado a su limite, si es asi, se reinicia a 0 y comenzará a sobrescribir.
        if(controlMovimientos == movimientos.length){
            setControlMovimientos(0);
        }
        //Añado el movimiento.
        movimientos[controlMovimientos] = "Se ha retirado " + dinero + "de la cuenta.";
        setControlMovimientos(getControlMovimientos()+1);
    }


}
