package ejercicio1;

public class persona implements Comparable<persona> {

    private String Nombre;
    private int Altura;
    private int Edad;

    
    public persona(String nombre, int altura, int edad) {
        this.Nombre = nombre;
        this.Altura = altura;
        this.Edad = edad;
    }

    @Override
    public int compareTo(persona other) {
        if(this.Altura-other.Altura == 0){
            return other.getEdad() - this.Edad;
        }
        return other.getAltura() - this.Altura;
    }



    public String getNombre() {
        return Nombre;
    }




    public void setNombre(String nombre) {
        Nombre = nombre;
    }




    public int getAltura() {
        return Altura;
    }




    public void setAltura(int altura) {
        Altura = altura;
    }




    public int getEdad() {
        return Edad;
    }




    public void setEdad(int edad) {
        Edad = edad;
    }
    
}
