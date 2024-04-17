package matrices;

import java.util.Scanner;

public class RecorreMatriz {
    /* 
     * Crea una matriz de números de 3x3, pidiendo cada número.
     * Al final recorre la matriz y muestrala.
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int [3][3];
        /* 
         *  0 0 0
         *  0 0 0
         *  0 0 0
         */
        // rellenar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un número en la posición i: " + i + "");
                matriz[i][j] = sc.nextInt();
            }
        }
        // mostrar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
     }
}
