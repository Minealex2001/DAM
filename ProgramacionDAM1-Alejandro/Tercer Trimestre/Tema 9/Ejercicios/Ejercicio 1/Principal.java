import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

  public static void main(String[] args) {
    Producto objeto1 = new Producto(5, "Alcachofa");
    Producto objeto2 = new Producto(6, "Tomate");
    Producto objeto3 = new Producto(4, "Pepino");
    Producto objeto4 = new Producto(7, "Lechuga");
    Producto objeto5 = new Producto(1, "Nico");
    ArrayList lista = new ArrayList();
    lista.add(objeto1);
    lista.add(objeto2);
    lista.add(objeto3);
    lista.add(objeto4);
    lista.add(objeto5);

    Iterator iterator = lista.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    lista.remove(3);
    lista.remove(1);

    lista.add(2, new Producto(12, "Mesa"));

    Iterator iterator2 = lista.iterator();
    while (iterator2.hasNext()) {
        System.out.println(iterator2.next());
      }

      lista.clear();
  }
}
