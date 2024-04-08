package basicos;

import java.util.Scanner;

public class Palindromo {
    
    /* 
     * Pide una frase por consola e indica si es palindromo.
     * 
     * Es Palindromo cuando se lee una frase igual de izquierda a derecha que de derecha a izquierda. 
     * Por ejemplo, alola
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        sc.useDelimiter("\n");
        String cadena = sc.nextLine().trim();
        String cadenaInvertida = "";

        char caracter;
        for(int i = cadena.length()-1; i >= 0; i--){
            caracter = cadena.charAt(i);
            cadenaInvertida += caracter;
        }
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("Es Palindromo");
        }else {
            System.out.println("No es Palindromo");
        }
     }
}
