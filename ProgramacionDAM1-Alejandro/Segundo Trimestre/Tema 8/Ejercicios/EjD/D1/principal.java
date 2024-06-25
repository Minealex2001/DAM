package EjD.D1;

public class principal {

  public static void main(String[] args) {
    punto punto1 = new punto(5, 0);
    punto punto2 = new punto(10, 10);
    punto punto3 = new punto(-3, 7);
    
    punto1.imprime();
    punto2.imprime();
    punto3.imprime();
    
    punto1.desplaza(1, 0);
    punto2.desplaza(0, -1);
    punto3.setX(punto3.getX() * 2);
    
    punto1.imprime();
    punto2.imprime();
    punto3.imprime();
    
    int distancia1y2 = punto1.distancia(punto2);
    System.out.println("Distancia entre Punto 1 y Punto 2: " + distancia1y2);
    int distancia1y3 = punto1.distancia(punto3);
    System.out.println("Distancia entre Punto 1 y Punto 3: " + distancia1y3);
    int distancia2y3 = punto2.distancia(punto3);
    System.out.println("Distancia entre Punto 2 y Punto 3: " + distancia2y3);
    }
}
