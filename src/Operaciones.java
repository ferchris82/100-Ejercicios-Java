import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el el primer número");
        int num1 = sc.nextInt();

        System.out.println("Escribe el segundo número");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma es : " + suma);

        int resta = num1 - num2;
        System.out.println("La resta es : " + resta);

        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación es : " + multiplicacion);

        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            double division = (double) num1 / num2;
            System.out.println("La división es : " + division);
        }
    }
}
