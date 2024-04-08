

import java.util.Scanner;

public class Concatenacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Dame una cadena:");
        String cadUsuario = sc.next();

        StringBuilder concatenar = new StringBuilder();

        while (!cadUsuario.isEmpty()) {
            concatenar.append(cadUsuario); // Usamos StringBuilder para concatenar

            System.out.println("Dame una cadena:");
            cadUsuario = sc.next();
        }

        System.out.println(concatenar.toString()); // Convertimos StringBuilder a String al final
    }
}
