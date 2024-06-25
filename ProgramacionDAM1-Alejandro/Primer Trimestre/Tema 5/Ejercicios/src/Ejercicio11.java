public class Ejercicio11 {
    public static void main(String[] args) {
        int imp=0,par=0;
        for (int c = 100; c <= 200; c++) {
            if (c % 2 ==0) {
               par = par + c;
            }else {
                imp = imp + c;
            }
        }
        System.out.println("La suma de los pares es: " + par + " y la de los impares es: " + imp);
    }
}
