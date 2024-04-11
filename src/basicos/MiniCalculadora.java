package basicos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniCalculadora {
    /*
     * Pide dos números por teclado y crea un pequeño menú con las
     * siguientes opciones:
     * 
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Módulo
     * 
     * Al final debemos preguntar si queremos realizar otra operación
     * más, en caso afirmativo, volveremos a empezar.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        int num1;
        int num2;

        System.out.println();
        while (!salir) {
            System.out.println();
            System.out.println("Inserta el primer numero");
            num1 = sc.nextInt();
            System.out.println("Inserta el segundo número");
            num2 = sc.nextInt();
            System.out.println("Que operación deseas realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Modulo");
            System.out.println("6. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println("El resultado del modulo es: " + (num1 % num2));
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números enteros");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }

    }
}
