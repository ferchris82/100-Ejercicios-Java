package basicos;

public class GeneraNumerosAleatorios {
    
    // Genera 10 números aleatorios entre 1 y 10

    public static void main(String[] args) {
        
        int maximo = 10;
        int minimo = 1;

        int aleatorio;
        for(int i = 0; i < 10; i++){
            aleatorio = (int)(Math.random()*(maximo - minimo + 1) + (minimo));
            System.out.println(aleatorio);
        }
    }
}
