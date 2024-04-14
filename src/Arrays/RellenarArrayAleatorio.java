package Arrays;

public class RellenarArrayAleatorio {
    
    /* 
     * Crea un array de 10 posiciones y rellenalo con números aleatorios.
     * Muestralos al final.
     * Crea una función para rellenarlo y otra para mostrar.
     */
    public static void main(String[] args) {
        
        int[] numerosAleatorios = new int[10];
        int minimo = 5; 
        int maximo = 10;

        rellenarArrayAleatorios(numerosAleatorios, minimo, maximo);
        mostrarArray(numerosAleatorios);
    }

    public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static void rellenarArrayAleatorios(int[] array, int minimo, int maximo){

        for(int i = 0; i <array.length; i++){
            array[i] = generaNumeroAleatorio(minimo, maximo);
        }
    }

    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

