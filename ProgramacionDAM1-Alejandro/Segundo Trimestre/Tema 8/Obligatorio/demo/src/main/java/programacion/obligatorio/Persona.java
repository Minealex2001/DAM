package programacion.obligatorio;
/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */
public class Persona  {

    /*
     * Creamos las variables privadas del objeto Persona
     * 
     * final String DNI = Almacena el DNI del usuario
     * Cuenta[] cuentas_bancarias = Almacena un array de objetos de tipo Cuenta
     * int contadorCuentas = Variable de control para que el usuario no 
     */
    private final String DNI;
    private Cuenta[] cuentas_bancarias = new Cuenta[3];
    private int contadorCuentas;

    //Constructor de la clase.
    public Persona(String DNI) {
        this.DNI = DNI;
        contadorCuentas = 0;
    }
    
    //Metodo para obtener el DNI del objeto.
    public String getDNI() {
        return DNI;
    }
    
    //Metodo para agregar una cuenta vinculado al usuario.
    public boolean agregarCuenta(String numeroCuenta, double saldoDisponible) {

        //Creamos una variable para controlar si el metodo funciona.
        boolean fin = true;

        //Comprobamos si el usuario ha llegado al limite de cuentas por usuario.
        if (contadorCuentas < 3) {

            //Llamamos al constructor del objeto Cuenta.
            cuentas_bancarias[contadorCuentas] = new Cuenta(numeroCuenta, saldoDisponible);

            //Añadimos 1 a la variable de control de sobre las cuentas.
            contadorCuentas++;
            fin = true;
        } else {
            fin = false;
        }
        return fin;
    }

    //Metodo que muestra la informacion del usuario.
    public void mostrarPersona(){
        System.out.println("El DNI del usuario es: " + getDNI());
        System.out.println("Tiene " + contadorCuentas + " asociadas a su cuenta.");

        //Imprime la informacion sobre las cuentas bancarias con el uso del los getters del objeto.
        for(int i=0; i < contadorCuentas; i++){
            System.out.println("La cuenta con el numero " + cuentas_bancarias[i].getNumeroCuenta() + " tiene " + cuentas_bancarias[i].getSaldoDisponible() + " de saldo disponible."); 
        }
    }

    //Metodo para añadir dinero a la cuenta bancaria.
    public void recibirNomina(double dinero, String numeroCuenta){
        for(int i=0; i < contadorCuentas; i++){
        //Comprueba si el numero de cuenta esta vinculada al usuario y existe.
        if(numeroCuenta.equals(cuentas_bancarias[i].getNumeroCuenta())){

            //Utiliza el metodo abonar del Objeto para añadir el dinero.
            cuentas_bancarias[i].abonar(dinero);
        }else{
            System.err.println("[ERROR] La cuenta bancaria no existe. Intentelo de nuevo.");
        }
        }
    }

    //Metodo para realizar un pago.
    public void realizarPago(String numeroCuenta, double dinero){
        for(int i=0; i< contadorCuentas; i++){

            //Comprueba si el numero de cuenta esta vinculada al usuario y existe.
            if(numeroCuenta.equals(cuentas_bancarias[i].getNumeroCuenta())){

                        //Comprueba si la cuenta bancaria seleccionada tiene el dinero necesario como para realizar la transaccion.
                        if(cuentas_bancarias[i].getSaldoDisponible()<dinero){
                            System.err.println("[ERROR] La cuenta no dispone de los fondos suficientes");
                        }else{
                            cuentas_bancarias[i].pagar(dinero);
                        }
            }else{
                System.err.println("[ERROR] La cuenta bancaria no existe. Intentelo de nuevo.");
            }
        }
    }

    //Metodo para realizar una transferencia entre dos cuentas del mismo usuario.
    public void transferenciaEntreCuentas(String numeroCuenta1, String numeroCuenta2, double dinero){
        for(int i=0; i< contadorCuentas; i++){

            //Comprobamos que el numero de cuenta 1 esta vincualda al usuario y existe.
            if(numeroCuenta1.equals(cuentas_bancarias[i].getNumeroCuenta())){
                for(int j=0; j < contadorCuentas; j++){

                    //Comprobamos que el numero de cuenta 2 esta vincualda al usuario y existe.
                    if(numeroCuenta2.equals(cuentas_bancarias[j].getNumeroCuenta())){

                        //Comprueba si la cuenta bancaria 1 seleccionada tiene el dinero necesario como para realizar la transaccion.
                        if(cuentas_bancarias[i].getSaldoDisponible()<dinero){
                            System.err.println("[ERROR] La cuenta no dispone de los fondos suficientes");
                        }else{

                            //Llamamos al metodo pagar para eliminar el dinero de la primera cuenta.
                            cuentas_bancarias[i].pagar(dinero);

                            //Llamamos al metodo abonar para añadir el dinero eliminado de la primera cuenta en la segunda.
                            cuentas_bancarias[j].abonar(dinero);
                        }
                    }
                }
            }
        }
    }

    //Metodo que imprime si el usuario tiene saldo negativo en alguna cuenta.
    public void esMorosa() {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas_bancarias[i].getSaldoDisponible() < 0) {
                System.out.println("El usuario " + getDNI() + " tiene saldo negativo en la cuenta " + cuentas_bancarias[i].getNumeroCuenta() + ".");
            }
        }
        }
    
    
}
