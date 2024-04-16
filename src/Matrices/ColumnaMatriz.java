package Matrices;

public class ColumnaMatriz {

    /* 
     * Crea una matriz de números de 3x3 tu mismo.
     * Crea una función que pasandole una matriz y una columna(número)
     * muestre solo esa columna
     */

     public static void main(String[] args) {
        
        int [][] matriz =
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        muestraColumnaMatriz(matriz, 2);
     }
     public static void muestraColumnaMatriz(int [][] matriz, int columna){

        if (columna>=0 && columna<matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][columna]);
            }
        } else {
            System.out.println("La columna no es valida");
        }
     }
}
