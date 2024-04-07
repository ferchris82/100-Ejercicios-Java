public class NumeroPar {

    /* Mostrar los números pares que hay entre el 1 y 10 (while y for) */

    public static void main(String[] args) {
        
        int i = 0;

        while(i < 10){
            i++;
            if(i % 2 == 0){
                System.out.println("Número par por ciclo (While) " + i);
            } 
        }

        for(int j = 1; j<=10; j++){
            if(j % 2 == 0){
                System.out.println("Número par por ciclo (For) " + j);
            }
        }

    }
}
