public class Ejercicio11 {
    public static void main(String[] args) {
        int array1[] = new int[100], array2[] = new int[100];
        for(int i = 1; i < array1.length+1; i++){
            array1[i-1] = i;
        }
        int v = array2.length - 1;
        for(int i = 0; i < array2.length; i++){
            array2[v] = array1[i];
            v--;
        }
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.println(" ");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i]+ " ");
        }    
    }
}
