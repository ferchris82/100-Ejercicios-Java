package basicos;

import java.util.Scanner;

public class Ecuacion2Grado {

    /*
     * Pide 3 números por consola y realiza una ecuación de segundo grado.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el valor de a");
        int a = sc.nextInt();

        System.out.println("Inserta el valor de b");
        int b = sc.nextInt();

        System.out.println("Inserta el valor de c");
        int c = sc.nextInt();

        double discriminante = (Math.pow(b, 2) - 4 * a * c);
        double x1, x2;
        if (discriminante > 0) {
            x1 = -b + (Math.sqrt(discriminante)) / (2 * a);
            x2 = -b - (Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La soluciones son: " + x1 + " " + x2);
        } else if (discriminante == 0) {
            x1 = -b / (2 * a);

            System.out.println("su unica solución es: " + x1);
        } else {
            System.out.println("No tiene solución");
        }

        
    }
}
