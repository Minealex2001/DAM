package EjC.C2;

import java.util.Scanner;

public class principal {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();

    System.out.println("Datos de la primera persona:");
    System.out.print("DNI: ");
    persona1.setDni(entrada.nextLine());
    System.out.print("Nombre: ");
    persona1.setNombre(entrada.nextLine());
    System.out.print("Apellidos: ");
    persona1.setApellidos(entrada.nextLine());
    System.out.print("Edad: ");
    persona1.setEdad(entrada.nextInt());

    entrada.nextLine();

    System.out.println("\nDatos de la segunda persona:");
    System.out.print("DNI: ");
    persona2.setDni(entrada.nextLine());
    System.out.print("Nombre: ");
    persona2.setNombre(entrada.nextLine());
    System.out.print("Apellidos: ");
    persona2.setApellidos(entrada.nextLine());
    System.out.print("Edad: ");
    persona2.setEdad(entrada.nextInt());

    System.out.println("\nInformación de las personas:");
    if (persona1.getEdad() >= 18) {
      System.out.println(
        persona1.getNombre() +
        " " +
        persona1.getApellidos() +
        " con DNI " +
        persona1.getDni() +
        " es mayor de edad"
      );
    } else {
      System.out.println(
        persona1.getNombre() +
        " " +
        persona1.getApellidos() +
        " con DNI " +
        persona1.getDni() +
        " no es mayor de edad"
      );
    }

    entrada.close();
  }
}
