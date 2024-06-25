package ejercicio2;

import java.math.BigDecimal;
import java.util.Comparator;

public class PriceComparator implements Comparator<CatalogItem> {

    @Override
    public int compare(CatalogItem o1, CatalogItem o2) {
            BigDecimal diff = o1.getPrice().subtract(o2.getPrice());
            return diff.compareTo(BigDecimal.ZERO);
    }
}