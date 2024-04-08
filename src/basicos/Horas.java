package basicos;

import java.util.Scanner;

public class Horas {

    /* 
     * Pide un número de segundos e indica cuantas horas, minutos
     * y segundos equivalen.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int SEG_HOR = 3600;

        System.out.println("Inserte los segundos");
        int segundos = sc.nextInt();

        int horas = segundos / SEG_HOR;
        int segundos_restantes = segundos % SEG_HOR;
        int minutos = segundos_restantes / 60;

        segundos = segundos_restantes % 60;

        System.out.println("Son " + horas + " hora/s, " + minutos + " minuto/s y " + segundos + " segundo/s");
    }
}
