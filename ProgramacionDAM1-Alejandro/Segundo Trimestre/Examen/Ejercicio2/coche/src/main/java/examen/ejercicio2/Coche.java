package examen.ejercicio2;

/*
 * Examen Segunda Evaluacion Ejercicio 2
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */

public class Coche {

    //Inicializamos las variables.
    private String matricula, color, propietario;
    private int plazas;
    private float cilindrada;

    /**
     * @param matricula
     * @param color
     * @param propietario
     * @param plazas
     * @param cilindrada
     */
    public Coche(String matricula, String color, String propietario, int plazas, float cilindrada) {
        this.matricula = matricula;
        this.color = color;
        this.propietario = propietario;
        this.plazas = plazas;
        this.cilindrada = cilindrada;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the plazas
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * @param plazas the plazas to set
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    /**
     * @return the cilindrada
     */
    public float getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Muestra todos los datos del coche.
    public void Visualiza(){
        System.out.println("La matricula del coche es: " + getMatricula());
        System.out.println("El color del coche es: " + getColor());
        System.out.println("La clindrada del coche es: " + getCilindrada());
        System.out.println("El coche tiene: " + getPlazas() + " plazas.");
        System.out.println("El coche es de: " + getPropietario());
    }
    
}
