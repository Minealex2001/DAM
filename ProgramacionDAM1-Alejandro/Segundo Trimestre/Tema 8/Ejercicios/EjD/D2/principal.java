package EjD.D2;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      persona persona1 = new persona();
      persona persona2 = new persona();
  
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
      persona1.imprime();
      System.out.println("Es mayor de edad: " + persona1.esMayorEdad());
      System.out.println("Es jubilado: " + persona1.esJubilado());
  
      persona2.imprime();
      System.out.println("Es mayor de edad: " + persona2.esMayorEdad());
      System.out.println("Es jubilado: " + persona2.esJubilado());
  
      int diferenciaEdad = persona1.diferenciaEdad(persona2);
      System.out.println("La diferencia de edad entre las personas es: " + diferenciaEdad);
  
      entrada.close();
    }
  }
