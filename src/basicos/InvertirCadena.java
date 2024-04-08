package basicos;
import java.util.Scanner;


public class InvertirCadena {
    
    // Pide una frase o palabra por consola e inviertela

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Inserta una palabra");
        
        String cadena = sc.nextLine();
        String cadenaInvertida = "";

        char caracter;
        for(int i = cadena.length()-1; i >= 0; i--){
            caracter = cadena.charAt(i);
            cadenaInvertida += caracter;
        }
        System.out.println("Palabra invertida " + cadenaInvertida);
    }
}
