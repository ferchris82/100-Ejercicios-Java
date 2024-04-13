package funciones;

public class DigitoMasAlto {
    
    /* 
     * Crea una función que dado un número, decir cual es el dígito
     * más alto que tiene.
     */

     public static void main(String[] args) {
        System.out.println(digitoMasAlto(453095));
     }

     public static int digitoMasAlto(int numero){

        final int DIVISOR = 10;

        int mayor = 0;

        for(int i = numero; i > 0; i/=DIVISOR){

            if ((i % DIVISOR) > mayor) {
                mayor = i % DIVISOR;
            }
        }
        return mayor;
     }
}
