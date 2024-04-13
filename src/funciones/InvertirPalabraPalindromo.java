package funciones;

public class InvertirPalabraPalindromo {
    
    /* 
     * Crea una función que indique si una frase o palabra pasada
     * por parámetro es un palindromo. Usa las funciones adicionales
     * que consideres adicionales. 
     */

     public static void main(String[] args) {
        if (esPalindromo("Alola")) {
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
     }

     public static String invertirString(String frase){

        String invertida = "";

        char caracter;
        for(int i = frase.length()-1; i>=0; i--){
            caracter = frase.charAt(i);
            invertida += caracter;
        }

        return invertida;
     }

     public static boolean esPalindromo(String frase) {
        String fraseOriginal = frase.toLowerCase().trim();
        String invertida = invertirString(fraseOriginal);

        // Comparamos las versiones normalizadas de la frase original y la invertida
        return fraseOriginal.equals(invertida);
    }
}
