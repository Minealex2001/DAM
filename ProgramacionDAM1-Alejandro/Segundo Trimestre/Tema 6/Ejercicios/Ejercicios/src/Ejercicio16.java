import java.util.Arrays;

public class Ejercicio16 {
    
    public static void main(String[] args) {

        int array[] = new int[55], control=1,control2=0;
        for(int i=1; i<=10; i++){
            control2 = control2+i;
            while(control<=i){
                Arrays.fill(array, control, control2, i);
                control++;
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
