package Matrices.ajedrez;

import java.util.*;

public class ReyAjedrez {

    /*
     * Teniendo una matriz de char de 8x8 simular el movimiento de un
     * rey de ajedrez.
     * Pudiendose moverse una posición dentro del tablero.
     * Deberas mostrar donde se encuentra en cada momento.
     * Mi consejo es que uses un menú.
     */

    public static void main(String[] args) {

        final char VACIO = 'X'; // Fila
        final char REY = 'O'; // Columna

        char[][] matriz = new char[8][8];

        rellenarMatriz(matriz, VACIO);

        int posActualReyX = 0, postAntiguaReyX = 0;
        int posActualReyY = 0, postAntiguaReyY = 0;

        

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        /*
         * 00 01 02
         * 10 11 12
         * 20 21 22
         */
        while (!salir) {

            mostrarMatriz(matriz);

            System.out.println("¿Donde quieres moverte?");
            System.out.println("1. Mover arriba");
            System.out.println("2. Mover arriba-derecha");
            System.out.println("3. Mover derecha");
            System.out.println("4. Mover abajo-derecha");
            System.out.println("5. Mover abajo");
            System.out.println("6. Mover abajo-izquierda");
            System.out.println("7. Mover izquierda");
            System.out.println("8. Mover arriba-izquierda");
            System.out.println("9. Mover Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                postAntiguaReyX = posActualReyX;
                postAntiguaReyY = posActualReyY;

                switch (opcion) {
                    case 1:
                        posActualReyX--;

                    case 2:
                        posActualReyX--;
                        posActualReyY++;

                    case 3:
                        posActualReyY++;

                    case 4:
                        posActualReyX++;
                        posActualReyY++;

                    case 5:
                        posActualReyX++;

                    case 6:
                        posActualReyX++;
                        posActualReyY--;

                    case 7:
                        posActualReyY--;

                    case 8:
                        posActualReyX--;
                        posActualReyY--;

                    case 9:
                        salir = true;

                    default:
                        System.out.println("Solo números entre 1 y 9");
                }

                matriz[posActualReyX][posActualReyY] = REY;
                matriz[posActualReyX][posAntiguaReyY] = VACIO;

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarMatriz(char[][] matriz, char simbolo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 'X';
            }
        }
    }

}
