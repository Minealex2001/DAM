package EjD.D2;

public class persona {

  private String dni;
  private String nombre;
  private String apellidos;
  private int edad;
  
  public void setDni(String dni) {
  this.dni = dni;
  }
  
  public void setNombre(String nombre) {
  this.nombre = nombre;
  }
  
  public void setApellidos(String apellidos) {
  this.apellidos = apellidos;
  }
  
  public void setEdad(int edad) {
  this.edad = edad;
  }
  
  public String getDni() {
  return dni;
  }
  
  public String getNombre() {
  return nombre;
  }
  
  public String getApellidos() {
  return apellidos;
  }
  
  public int getEdad() {
  return edad;
  }
  
  public void imprime() {
  System.out.println("DNI: " + dni + ", Nombre: " + nombre + " " + apellidos + ", Edad: " + edad);
  }
  
  public boolean esMayorEdad() {
  return edad >= 18;
  }
  
  public boolean esJubilado() {
  return edad >= 65;
  }
  
  public int diferenciaEdad(persona p) {
  return Math.abs(this.edad - p.getEdad());
  }
  }
