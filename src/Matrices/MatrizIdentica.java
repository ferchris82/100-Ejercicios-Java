package matrices;

public class MatrizIdentica {
    /*
     * Crea una matriz de números de 3x3 tu mismoo.
     * Crea una función que pasandole la matriz y la fila a revisar,
     * debe indicar si los valores de esa fila son identicos.
     */

    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 4, 4 },
                { 7, 7, 7 }
        };

        System.out.println(filaIdenticaMatriz(matriz, 2));
    }

    public static boolean filaIdenticaMatriz(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            int primerValor = matriz[fila][0];
            for (int j = 1; j < matriz[0].length; j++) {
                if (primerValor != matriz[fila][j]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
