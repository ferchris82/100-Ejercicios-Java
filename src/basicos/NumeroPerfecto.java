package basicos;

import java.util.Scanner;

public class NumeroPerfecto {
    
    /* 
     * Pide un número por consola e indica si es un número perfecto.
     * Un número perfecto es un número natural que es igual a la suma de sus
     * divisores propios positivos.
     * Por ejemplo, el 28 es un número perfecto: 28 = 1 + 2 + 4 + 7 + 14
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        do{
            System.out.println("Inserta un número");
            numero = sc.nextInt();

            if (!(numero >=0)) {
                System.out.println("Debes escribir un número mayor que 0");
            }
        } while (!(numero >= 0));

        int suma = 0;
        for(int i = 1; i <= numero / 2; i++){
            if(numero % i == 0){
                suma += i;
            }
        }
        if (numero == suma) {
            System.out.println("Es un número perfecto");
        } else{
            System.out.println("No es un número perfecto");
        }
    }
 
}
