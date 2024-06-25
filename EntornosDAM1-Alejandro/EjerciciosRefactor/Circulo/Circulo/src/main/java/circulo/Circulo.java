package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * 
 * @author 
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;

    public Circulo() {
    }

    public Circulo(int x, int y, double radio) {
        this.x = x;
        this.y = y;
        establecerRadio(radio);
    }

    public void establecerX(int x) {
        this.x = x;
    }

    public int obtenerX() {
        return x;
    }

    public void establecerY(int y) {
        this.y = y;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio(double radio) {
        this.radio = (radio < 0.0 ? 0.0 : radio);
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    public void trasladarCentro() {
        x += 5;
        y += 5;
    }
}
