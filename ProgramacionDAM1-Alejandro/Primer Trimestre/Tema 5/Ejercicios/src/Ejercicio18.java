public class Ejercicio18 {
    public static void main(String[] args) {
        int suma = 0;
        for (int contador=1; contador <= 5; contador++) {
            suma += (Math.pow(contador, 2));
        }
        System.out.println(suma);
    }
}
