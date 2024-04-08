package basicos;
import java.util.Scanner;

public class Menor {

    /*
     * Pide 2 números por consola e indica cual es el menor de los 2 numeros .
     * En caso de que sean iguales, también lo debes indicar.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame le primer número");
        int num1 = sc.nextInt();

        System.out.println("Dame el segundo número");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor al número " + num2);
        } else if (num1 == num2) {
            System.out.println("Es el mismo número");
        } else {
            System.out.println("El número " + num2 + " es menor al número " + num1);
        }

    }

}
