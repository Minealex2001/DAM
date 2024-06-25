package ejercicio2;

import java.util.Comparator;

public class CategoryPriceComparator implements Comparator<CatalogItem> {

  @Override
  public int compare(CatalogItem o1, CatalogItem o2) {
    // Primero comparamos por category
    int resultado = o1.getCategory().compareTo(o2.getCategory());
    // Si las categories son iguales, entonces comparamos por price
    if (resultado == 0) {
      resultado = o1.getPrice().compareTo(o2.getPrice());
    }
    return resultado;
  }
}
