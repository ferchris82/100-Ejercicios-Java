package Arrays;

import java.util.Scanner;

public class DniNumero {

    /* 
     * Dado un array de caracteres (te lo doy yo) y tu número de DNI, debes
     * sacar la letra de tu DNI.
     * 
     * Para obtenerla solo debe sacar el módulo de 23 y ese será el 
     * indice del array
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char letrasNIF[] = {'T','R','W','A','G','M','Y',
            'F','P','D','X','B','N','J','Z',
            'S','Q','H','L','C','K','E'};

            System.out.println("Escribe un número de DNI");
            int dni = sc.nextInt();

            final int DIVISOR = 23;

            int indiceLetra = dni % DIVISOR;

            System.out.println(dni+""+letrasNIF[indiceLetra]);
     }
}
