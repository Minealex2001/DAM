package EjA.A1;

public class ejercicio1 {
    public static void main(String[] args) {
        PuntoCla punto1 = new PuntoCla(5, 0);
        PuntoCla punto2 = new PuntoCla(10, 10);
        PuntoCla punto3 = new PuntoCla(-3, 7);
    
        System.out.println("Coordenadas Punto 1: (" + punto1.x + "," + punto1.y + ")");
        System.out.println("Coordenadas Punto 2: (" + punto2.x + "," + punto2.y + ")");
        System.out.println("Coordenadas Punto 3: (" + punto3.x + "," + punto3.y + ")");
    
        punto1.x = punto1.x + 1;
        punto2.y = punto2.y - 1;
        punto3.x = punto3.x * 2;
    
        System.out.println("Coordenadas Punto 1 modificadas: (" + punto1.x + "," + punto1.y + ")");
        System.out.println("Coordenadas Punto 2 modificadas: (" + punto2.x + "," + punto2.y + ")");
        System.out.println("Coordenadas Punto 3 modificadas: (" + punto3.x + "," + punto3.y + ")");
      }
}
