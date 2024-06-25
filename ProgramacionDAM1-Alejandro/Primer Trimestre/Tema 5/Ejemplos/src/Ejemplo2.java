
public class Ejemplo2 {
public static void main(String[] args) {
   int pares = 0 , impares = 0;
   for (int c = 100; c <=200; c++){
    if (c % 2 == 0) {
        pares = pares + c;
    }else {
        impares = impares + c;
    }
   }
   System.out.println("El numero de pares es: " + pares + " y el numero de impares es: " +impares);
}
}
