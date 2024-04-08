package basicos;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maximo = 100;  // Rango máximo de números para adivinar
        int minimo = 1;    // Rango mínimo de números para adivinar
        int numeroAcertar = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        int numeroUsuario;
        boolean fin = false;

        while (!fin) {
            do {
                System.out.println("Inserta un número entre " + minimo + " y " + maximo);
                numeroUsuario = sc.nextInt();
                if (!(numeroUsuario >= minimo && numeroUsuario <= maximo)) {
                    System.out.println("Debes escribir un número entre " + minimo + " y " + maximo);
                }
            } while (!(numeroUsuario >= minimo && numeroUsuario <= maximo));

            if (numeroUsuario < numeroAcertar) {
                System.out.println("Es mayor de lo que introdujiste");
            } else if (numeroUsuario > numeroAcertar) {
                System.out.println("Es menor de lo que introdujiste");
            } else {
                System.out.println("¡Has acertado! El número era el " + numeroAcertar);
                fin = true;
            }
        }

        sc.close(); // Cierra el Scanner al finalizar
    }
}