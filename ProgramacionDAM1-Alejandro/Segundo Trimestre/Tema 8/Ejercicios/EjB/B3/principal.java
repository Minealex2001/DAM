package EjB.B3;

class Persona {

  public class Main {

    public static void main(String[] args) {
      rectangulo rectangulo1 = new rectangulo(0, 0, 5, 5);
      rectangulo rectangulo2 = new rectangulo(7, 9, 2, 3);

      System.out.println("Rectángulo 1:");
      System.out.println(
        "Coordenadas: (" +
        rectangulo1.x1 +
        ", " +
        rectangulo1.y1 +
        "), (" +
        rectangulo1.x2 +
        ", " +
        rectangulo1.y2 +
        ")"
      );
      System.out.println("Perímetro: " + rectangulo1.getPerimetro());
      System.out.println("Área: " + rectangulo1.getArea());

      System.out.println("\nRectángulo 2:");
      System.out.println(
        "Coordenadas: (" +
        rectangulo2.x1 +
        ", " +
        rectangulo2.y1 +
        "), (" +
        rectangulo2.x2 +
        ", " +
        rectangulo2.y2 +
        ")"
      );
      System.out.println("Perímetro: " + rectangulo2.getPerimetro());
      System.out.println("Área: " + rectangulo2.getArea());

      rectangulo1.setX1(1);
      rectangulo1.setY1(1);
      rectangulo1.setX2(6);
      rectangulo1.setY2(6);

      rectangulo2.setX1(3);
      rectangulo2.setY1(3);
      rectangulo2.setX2(4);
      rectangulo2.setY2(4);
    }
  }
}
