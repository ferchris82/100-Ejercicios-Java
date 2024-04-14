package Arrays;

import java.util.Scanner;

public class CrearArrayMostrar {
    /* 
     * Crea un array de 3 posiciones, rellenalo pidiendo los números al
     * usuario y recorrelo para mostrarlo.
     */

     public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[3];

        int numero;
        System.out.println("Insertando números");
        for (int i = 0; i<numeros.length;i++){
            System.out.println("Insertar un número en la posición " + i);
            numero = sc.nextInt();
            numeros[i] = numero;
        }
        System.out.println("Mostrar array");
        for(int i = 0; i<numeros.length;i++){
            System.out.println(numeros[i ]);
        }
     }


}
