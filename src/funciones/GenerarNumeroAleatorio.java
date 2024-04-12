package funciones;

public class GenerarNumeroAleatorio {
    
    /* 
     * Crea una función que genere un número aleatorio entre dos números pasados por parámetro.
     */

     public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println(generaNumeroAleatorio(1, 10));
        }
     }

     public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo-minimo+1) + (minimo));
     }
}
