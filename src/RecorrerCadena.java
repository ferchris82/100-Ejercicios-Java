import java.util.Scanner;

public class RecorrerCadena {

    // Pide una cadena por consola y muestra sus caracteres uno a uno

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cadena");

        String cadena = sc.nextLine();

        
        for(int i = 0; i <= cadena.length(); i++){
            char caracter = cadena.charAt(i);
            System.out.println(caracter);
        }
    }
}
