package basicos;
import java.util.Scanner;

public class ValidarNumero {

    /*
     * Pide un número por consola y valida que ese número este entre 0 y 10.
     * Hazlo con un do-while
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int numero;
        do{
            System.out.println("Inserta un número");
            numero = sc.nextInt();

            if(!(numero >= 0 && numero<=10)){
                System.out.println("Debes escribir un número entre 0 y 10");
            }

        } while(!(numero >= 0 && numero<=10));
        System.out.println("El número " + numero + " esta entre 0 y 10");
     }
}
