package ejercicio3;

import java.util.Comparator;

public class LongitudComparator implements Comparator<EstacionMeteo> {

    @Override
    public int compare(EstacionMeteo estacion1, EstacionMeteo estacion2) {
        double longitud1 = estacion1.getLongitud();
        double longitud2 = estacion2.getLongitud();

        if (longitud1 < longitud2) {
            return -1;
        } else if (longitud1 > longitud2) {
            return 1;
        } else {
            return 0;
        }
    }

}

