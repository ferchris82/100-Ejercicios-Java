package funciones;

import java.util.Scanner;

public class ValidarNumero {

    /* 
     * Crea una función que valide un número entre dos números.
     * Necesitas dos parámetros numérico.
     */

     public static void main(String[] args) {
        System.out.println(validaNumero(0, 10));
     }

     public static int validaNumero(int minimo, int maximo){
        Scanner sc = new Scanner(System.in);

        if(minimo > maximo){
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        int numero; 
        do{
            System.out.println("Escribe un número");
            numero = sc.nextInt();

            if (!(numero >= minimo && numero <= maximo)) {
                System.out.println("Debes escribir un número entre " + minimo + " y " + maximo);
            }
        }while(!(numero >= minimo && numero <= maximo));

        return numero;
     }
}
