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

                switch (opcion) {
                    case 1:
                        posActualReyX--;
                        break;
                    case 2:
                        posActualReyX--;
                        posActualReyY++;
                        break;
                    case 3:
                        posActualReyY++;
                        break;
                    case 4:
                        posActualReyX++;
                        posActualReyY++;
                        break;
                    case 5:
                        posActualReyX++;
                        break;
                    case 6:
                        posActualReyX++;
                        posActualReyY--;
                        break;
                    case 7:
                        posActualReyY--;
                        break;
                    case 8:
                        posActualReyX--;
                        posActualReyY--;
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Introduce un número del 1 al 9.");
                        continue;
                }

                // Verificar límites del tablero
                if (posActualReyX < 0 || posActualReyX >= 8 || posActualReyY < 0 || posActualReyY >= 8) {
                    System.out.println("Movimiento inválido. El rey no puede salir del tablero.");
                    posActualReyX = posActualReyX < 0 ? 0 : (posActualReyX >= 8 ? 7 : posActualReyX);
                    posActualReyY = posActualReyY < 0 ? 0 : (posActualReyY >= 8 ? 7 : posActualReyY);
                    continue;
                }

                // Actualizar la matriz con la nueva posición del rey
                matriz[posActualReyX][posActualReyY] = REY;
                matriz[posActualReyX - (posActualReyX == 0 ? 0 : 1)][posActualReyY - (posActualReyY == 0 ? 0 : 1)] = VACIO;

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
