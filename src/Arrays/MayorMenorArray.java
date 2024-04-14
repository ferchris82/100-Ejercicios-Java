package Arrays;

import java.util.Arrays;

public class MayorMenorArray {

    /* 
     * Mostrar el menor y mayor de un array de números creado por ti mismo.
     */

     public static void main(String[] args) {
        
        int [] array = {4,70,3,90,102,5};
        System.out.println("V1");
        mayorMenorArray(array);
        System.out.println("V2");
        mayorMenorArrayV2(array);

     }

     public static void mayorMenorArray(int[] array){

        int mayor = array[0];
        int menor = array[0];


        for (int i = 0; i < array.length; i++) {
            if(array[i] > mayor){
                mayor = array[i];
            }
            if (array[i]<menor) {
                menor = array[i];
            }    
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
     }

     public static void mayorMenorArrayV2(int[] array){
        Arrays.sort(array);

        int mayor=array[array.length-1];
        int menor=array[0];

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
     }
}
