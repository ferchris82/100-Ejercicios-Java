package matrices.ajedrez;

import java.util.*;

public class ReyAjedrez {

    public static void main(String[] args) {

        final char VACIO = 'X'; // Casilla vacía
        final char REY = 'O';   // Rey

        char[][] matriz = new char[8][8];

        // Inicializar matriz con casillas vacías
        rellenarMatriz(matriz, VACIO);

        // Posición inicial del rey (arriba a la izquierda)
        int posActualReyX = 0;
        int posActualReyY = 0;
        matriz[posActualReyX][posActualReyY] = REY;

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMatriz(matriz);

            System.out.println("¿Dónde quieres moverte?");
            System.out.println("1. Mover arriba");
            System.out.println("2. Mover arriba-derecha");
            System.out.println("3. Mover derecha");
            System.out.println("4. Mover abajo-derecha");
            System.out.println("5. Mover abajo");
            System.out.println("6. Mover abajo-izquierda");
            System.out.println("7. Mover izquierda");
            System.out.println("8. Mover arriba-izquierda");
            System.out.println("9. Salir");

            System.out.println("Escribe una de las opciones:");
            try {
                int opcion = sc.nextInt();

                // Limpiar el buffer
                sc.nextLine();

                int nuevaPosX = posActualReyX;
                int nuevaPosY = posActualReyY;

                switch (opcion) {
                    case 1 -> nuevaPosX--;
                    case 2 -> {
                        nuevaPosX--;
                        nuevaPosY++;
                    }
                    case 3 -> nuevaPosY++;
                    case 4 -> {
                        nuevaPosX++;
                        nuevaPosY++;
                    }
                    case 5 -> nuevaPosX++;
                    case 6 -> {
                        nuevaPosX++;
                        nuevaPosY--;
                    }
                    case 7 -> nuevaPosY--;
                    case 8 -> {
                        nuevaPosX--;
                        nuevaPosY--;
                    }
                    case 9 -> salir = true;
                    default -> System.out.println("Opción inválida. Introduce un número del 1 al 9.");
                }

                // Verificar límites del tablero
                if (nuevaPosX >= 0 && nuevaPosX < 8 && nuevaPosY >= 0 && nuevaPosY < 8) {
                    // Limpiar posición anterior del rey
                    matriz[posActualReyX][posActualReyY] = VACIO;
                    // Actualizar posición del rey
                    matriz[nuevaPosX][nuevaPosY] = REY;
                    // Actualizar posición actual del rey
                    posActualReyX = nuevaPosX;
                    posActualReyY = nuevaPosY;
                } else {
                    System.out.println("Movimiento inválido. El rey no puede salir del tablero.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sc.nextLine(); // Limpiar el buffer
            }
        }
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarMatriz(char[][] matriz, char simbolo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = simbolo;
            }
        }
    }
}
