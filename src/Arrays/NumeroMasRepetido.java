package Arrays;

public class NumeroMasRepetido {
    /* 
     * Dado un array de números, indica cual es el elemento más repetido,
     * en caso de empate, mostrar el último más repetido
     */

     public static void main(String[] args) {
        
        int [] a = {1,5,4,3,1,2,4,3,3,6,5,5,3};

        int contador = 0;
        int mayor = 0;
        int mayorRepeticiones = 0;

         int numeroBuscado; // primer bucle
         int numeroActual; // bucle anidado
        for (int i = 0; i < a.length; i++) {
            numeroBuscado = a[i];
            contador = 0;
            for (int j = 0; j < a.length; j++) {
                numeroActual = a[j];
                if (numeroBuscado == numeroActual) {
                    contador++;
                }
            }
            if (contador >= mayorRepeticiones) {
                mayor = numeroBuscado;
                mayorRepeticiones = contador;
            }
        }
        System.out.println("El número más repetido es " + mayor + " con " + mayorRepeticiones + " repeticiones");
     }
}
