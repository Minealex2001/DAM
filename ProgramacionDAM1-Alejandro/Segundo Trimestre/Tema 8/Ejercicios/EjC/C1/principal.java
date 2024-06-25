package EjC.C1;

public class principal {

  public static void main(String[] args) {
    punto punto1 = new punto(5, 0);
    punto punto2 = new punto(10, 10);
    punto punto3 = new punto(-3, 7);

    System.out.println(
      "Coordenadas Punto 1: (" + punto1.x + "," + punto1.y + ")"
    );
    System.out.println(
      "Coordenadas Punto 2: (" + punto2.x + "," + punto2.y + ")"
    );
    System.out.println(
      "Coordenadas Punto 3: (" + punto3.x + "," + punto3.y + ")"
    );

    punto1.x = punto1.x + 1;
    punto2.y = punto2.y - 1;
    punto3.x = punto3.x * 2;

    System.out.println(
      "Coordenadas Punto 1 modificadas: (" + punto1.x + "," + punto1.y + ")"
    );
    System.out.println(
      "Coordenadas Punto 2 modificadas: (" + punto2.x + "," + punto2.y + ")"
    );
    System.out.println(
      "Coordenadas Punto 3 modificadas: (" + punto3.x + "," + punto3.y + ")"
    );
  }
}
