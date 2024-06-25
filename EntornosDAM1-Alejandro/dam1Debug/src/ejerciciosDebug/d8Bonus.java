package ejerciciosDebug;

/*
 * Mediante el uso de puntos de interrupcion e inspeccion de variables descubre que 
 * hace el siguiente programa y explica como lo hace.
 * 
 * 
 */
    /*
    * El código que has proporcionado ordena un array de números enteros de menor a mayor utilizando este algoritmo.
    *
    *La idea principal detrás de este algoritmo es recorrer el array varias veces, comparando parejas de números consecutivos y intercambiándolos de posición si el primer número es mayor que el segundo. 
    *Al final del proceso, los números estarán ordenados de menor a mayor.
    *
    *A continuación, te explico cómo funciona el código paso a paso:
    *
    *1.Se declara un array de números enteros y se inicializa con algunos valores.
    *2.Se guarda el tamaño del array en la variable n.
    *3.Se inicia un bucle for externo que se ejecutará n-1 veces. La variable i se utiliza como índice para recorrer el array.
    *4.Se inicia un bucle for interno que se ejecutará n-i-1 veces. La variable j también se utiliza como índice para recorrer el array.
    *5.Se comparan los números en las posiciones j e j+1. Si el número en la posición j es mayor que el número en la posición j+1, se intercambian de posición utilizando una variable temporal.
    *6.Una vez que se han comparado todas las parejas de números, se vuelve al bucle externo y se repite el proceso hasta que se haya recorrido el array completo.
    *7.Al final del proceso, se llama al método muestraPorPantalla para mostrar el array ordenado por pantalla.
    */
public class d8Bonus {
 
    public static void main(String args[])
    {

        int numeros[] = { 52, 11, 41, 5, 33, 27, 9 };
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                   
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
       
        muestraPorPantalla(numeros);
    }
    
    public static void muestraPorPantalla(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
