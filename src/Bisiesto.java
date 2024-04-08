import java.util.Scanner;

public class Bisiesto {
    
    /* Pide un año por teclado(número) e indica si es bisiesto o no.
    Es bisiesto cuando es divisible entre 4 y no divisible entre 100
    o si es divisible entre 400. */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un año");
        int anio = sc.nextInt();

        // && (and)
        /* 
            V & V = V
            V & F = F
            F & V = F
            F & F = F
        */

        // || (or)

        /* 
            V | V = V 
            V | F = V 
            F | V = V 
            F | F = F
        */

        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
