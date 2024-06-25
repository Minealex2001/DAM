package programacion.obligatorio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

/**
 * Integer.parseInt(entrada.readLine());
 *
 */

public class PruebaCuentas {

  public static void main(String[] args)throws NumberFormatException, IOException {

    //Inicializo el Buffered Reader que utilizaremos para leer el teclado.
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * Inicializamos las variables que usaremos en el programa
     * -int Respuesta = Se usa para saber en que parte del menu quiere acceder.
     * -int numeroPersona = Mantener el control de cuantas personas hay en el sistema y que no se salga del array.
     * -double saldoDisponible = Valor el cual se usa para saber cuanto dinero tiene en cuenta.
     * -String DNI = Se utiliza para introduccir el DNI del usuario.
     * -String numeroCuenta, numeroCuenta2 = Se utiliza para saber cual es el numero de cuenta que se quiere utilizar.
     * -Persona personas[] = Array de nuestro objeto Persona el cual se usara para almacenar los usuarios.
     */
    int respuesta, numeroPersona = 0;
    double saldoDisponible;
    Boolean correcto;
    String DNI, numeroCuenta, numeroCuenta2;
    Persona personas[] = new Persona[20];

    //Realizamos un do-while para que el programa este en bucle hasta que el usuario quiera detenerlo.
    do {

      //Mostramos el menu, para que el usuario conozca que opciones tiene disponibles.
      System.out.println("¿Que quieres realizar?");
      System.out.println("1. Añadir una persona");
      System.out.println("2. Añadir una Cuenta y asociar una persona");
      System.out.println("3. Mostrar datos de una persona");
      System.out.println("4. Recibe la nomina mensual");
      System.out.println("5. Relizar un pago");
      System.out.println("6. Realizar una transferencia");
      System.out.println("7. Mostrar las personas morosas");
      System.out.println("Escribe 0 para salir del programa");

      //Leemos el valor que ha ingresado el usuario.
      respuesta = Integer.parseInt(entrada.readLine());

      //Dependiendo del valor ingresado entrara en un caso diferente.
      switch (respuesta) {

        //Caso 1 = Añadir una persona.
        case 1:

          //Preguntamos cual es el DNI del usuario y lo almacenamos en la variable DNI.
          System.out.println("¿Cual es el DNI?");
          DNI = entrada.readLine();

          //Una vez introducido, el dato de DNI se envia al constructor de Persona.
          personas[numeroPersona] = new Persona(DNI);

          //Se añade 1 al contador de numeroPersona, para que la siguiente vez que se añada un usuario no se sobreescriba el anterior.
          numeroPersona++;
          break;

        //Caso 2 = Añadir una cuenta y asociar a un usuario.
        case 2:
        //Inicializamos el valor correcto con un false para hacerle saber al usuario si al final se ha realizado con exito la accion.
        correcto = false;

          //Comprobamos que el numero de numeroPersona sea distinto a 0, ya que no se puede añadir una cuenta sin ningun usuario.
          if (numeroPersona != 0) {

            //Si tenemos usuarios en el sistema, preguntamos a que usuario quieres asociar la cuenta.
            System.out.println("¿A que persona quieres asociar la cuenta?");
            DNI = entrada.readLine();

              //Buscamos si el usuario existe.
              for (int i = 0; i < numeroPersona; i++) {

                //Si el usuario existe, pregunta cual es el numero de cuenta y cual es su saldo.
                if (personas[i].getDNI().equals(DNI)) {
                  System.out.println("¿Cual es el numero de cuenta?");
                  numeroCuenta = entrada.readLine();
                  System.out.println("¿Cual es el saldo disponible?");
                  saldoDisponible = Double.parseDouble(entrada.readLine());

                  //Comprobamos si al agregar la cuenta devuelve true o false y en funcion de lo que devuelve decimos si ha sido posible o no.
                  if (personas[i].agregarCuenta(numeroCuenta, saldoDisponible)) {
                    System.out.println("La cuenta se ha añadido correctamente.");
                    correcto = true;
                  }else{
                    System.err.println("[ERROR] Has llegado al limite de cuentas.");
                    correcto = true;
                  }
                }
              }

            //Esta estructura se repite en todo el programa, comprueba si se ha podido encontrar el usuario
            if(!correcto){
              System.err.println("[ERROR] No se ha podido encontrar al usuario. Intentelo de nuevo");
            }

          //y avisa si hay una persona en el sistema.
          } else {
            System.err.println(
              "[ERROR] Primero tienes que añadir una persona"
            );
          }
          break;

        //Caso 3 = Mostrar datos de un usuario.
        case 3:

        
        //Inicializamos el valor correcto con un false para hacerle saber al usuario si al final se ha realizado con exito la accion.
        correcto = false;

        //Comprobamos que el numero de numeroPersona sea distinto a 0, ya que no se puede añadir una cuenta sin ningun usuario.
        if (numeroPersona != 0) {

          //Si tenemos usuarios en el sistema, preguntamos a que usuario quieres mostrar los datos.
          System.out.println("¿Que persona quieres mostrar?");
          DNI = entrada.readLine();

          //Buscamos si el usuario existe.
          for (int i = 0; i < numeroPersona; i++) {

            //Si el usuario existe, muestra todos los datos.
            if (personas[i].getDNI().equals(DNI)) {
              personas[i].mostrarPersona();
              correcto = true;
            }
          }

            //Esta estructura se repite en todo el programa, comprueba si se ha podido encontrar el usuario
            if(!correcto){
              System.err.println("[ERROR] No se ha podido encontrar al usuario. Intentelo de nuevo");
            }

          //y avisa si hay una persona en el sistema.
          } else {
            System.err.println(
              "[ERROR] Primero tienes que añadir una persona"
            );
          }
          break;

        //Caso 4 = Recibe la nomina mensual.
        case 4:

        //Inicializamos el valor correcto con un false para hacerle saber al usuario si al final se ha realizado con exito la accion.        
        correcto = false;

        //Comprobamos que el numero de numeroPersona sea distinto a 0, ya que no se puede añadir una cuenta sin ningun usuario.        
        if (numeroPersona != 0) {

          //Si tenemos usuarios en el sistema, preguntamos a que usuario quieres que reciba la nomina.         
          System.out.println("¿Que persona tiene que recibir la nomina?");
          DNI = entrada.readLine();

          //Buscamos si el usuario existe.
          for (int i = 0; i < numeroPersona; i++) {

            //Si el usuario existe, preguntamos a que cuenta quieres recibir la nomina.
            System.out.println("¿A que cuenta quieres recibir la nomina?");
            numeroCuenta = entrada.readLine();

            //Preguntamos que cantidad de dinero quiere recibir.
            System.out.println("¿Cuanto dinero vas a recibir?");
            saldoDisponible = Double.parseDouble(entrada.readLine());

            //Llamamos al metodo del objeto recibirNomina y la añadimos el dinero.
            personas[i].recibirNomina(saldoDisponible, numeroCuenta);
            correcto = true;
          }
            //Esta estructura se repite en todo el programa, comprueba si se ha podido encontrar el usuario
            if(!correcto){
              System.err.println("[ERROR] No se ha podido encontrar al usuario. Intentelo de nuevo");
            }

          //y avisa si hay una persona en el sistema.
          } else {
            System.err.println(
              "[ERROR] Primero tienes que añadir una persona"
            );
          }
          break;

        //Caso 5 = Realizar un pago.
        case 5:

        //Inicializamos el valor correcto con un false para hacerle saber al usuario si al final se ha realizado con exito la accion.        
        correcto = false;

        //Comprobamos que el numero de numeroPersona sea distinto a 0, ya que no se puede añadir una cuenta sin ningun usuario.        
        if (numeroPersona != 0) {

          //Preguntmaos que usuario tiene que realizar el pago.
          System.out.println("¿Que persona tiene que realizar el pago?");
          DNI = entrada.readLine();

          for (int i = 0; i < numeroPersona; i++) {
            //Si la persona existe, preguntamos de que cuenta quiere realizar el pago y que cantidad.
            if (personas[i].getDNI().equals(DNI)) {
            System.out.println("¿Que cuenta tiene que realizar el pago?");
            numeroCuenta = entrada.readLine();
            System.out.println("¿Cuanto dinero vas a pagar?");
            saldoDisponible = Double.parseDouble(entrada.readLine());

            //Llamamos al metodo realizarPago del objeto Persona.
            personas[i].realizarPago(numeroCuenta, saldoDisponible);
            correcto = true;
            }
          }
            //Esta estructura se repite en todo el programa, comprueba si se ha podido encontrar el usuario
            if(!correcto){
              System.err.println("[ERROR] No se ha podido encontrar al usuario. Intentelo de nuevo");
            }

          //y avisa si hay una persona en el sistema.
          } else {
            System.err.println(
              "[ERROR] Primero tienes que añadir una persona"
            );
          }
          break;

        //Caso 6 = Realizar una trasferencia entre cuentas.
        case 6:
        
        //Inicializamos el valor correcto con un false para hacerle saber al usuario si al final se ha realizado con exito la accion.        
        correcto = false;

        //Comprobamos que el numero de numeroPersona sea distinto a 0, ya que no se puede añadir una cuenta sin ningun usuario.        
        if (numeroPersona != 0) {

          //Preguntmaos que usuario tiene que realizar la transferencia.
          System.out.println("¿Que persona tiene que realizar la transferencia?");
          DNI = entrada.readLine();

          for (int i = 0; i < numeroPersona; i++) {

            //Si la persona existe, preguntamos de que cuenta a que cuenta quiere realizar la transferencia y que cantidad.
            if (personas[i].getDNI().equals(DNI)) {
            System.out.println("¿De que cuenta quieres realizar la transferencia?");
            numeroCuenta = entrada.readLine();
            System.out.println("¿A que cuenta quieres realizar la transferencia?");
            numeroCuenta2 = entrada.readLine();
            System.out.println("¿Cuanto dinero quieres transferir?");
            saldoDisponible = Double.parseDouble(entrada.readLine());

            //Llamamos al metodo del objeto transferenciaEntreCuentas.
            personas[i].transferenciaEntreCuentas(numeroCuenta, numeroCuenta2, saldoDisponible);
            correcto = true;
            }
          }
            //Esta estructura se repite en todo el programa, comprueba si se ha podido encontrar el usuario
            if(!correcto){
              System.err.println("[ERROR] No se ha podido encontrar al usuario. Intentelo de nuevo");
            }

          //y avisa si hay una persona en el sistema.
          } else {
            System.err.println(
              "[ERROR] Primero tienes que añadir una persona"
            );
          }
          break;

        //Caso 7 = Mostrar morosos.
        case 7:
        if (numeroPersona != 0) {
        //Recorremos el array de personas y llamamos al metodo esMorosa.
          for(int i=0; i<numeroPersona; i++){
            personas[i].esMorosa();
          }
        } else {
          //Avisa si no hay una persona en el sistema.
          System.err.println(
            "[ERROR] Primero tienes que añadir una persona"
          );
        }
          break;

        default:
          break;
      }
    } while (respuesta != 0);
  }
}