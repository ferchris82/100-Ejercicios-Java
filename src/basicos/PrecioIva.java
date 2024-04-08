package basicos;

import java.util.Locale;
import java.util.Scanner;


public class PrecioIva {
    
    /* 
     * Pide un número real que represente a un precio y muestra
     * el precio con IVA. El iva es de 21%.
     */

     public static void main(String[] args) {
         
        final double IVA = 0.19;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el precio");
        sc.useLocale(Locale.US);
        double precioSinIva = sc.nextDouble();

      //   double precioConIva = precioSinIva + (precioSinIva * IVA);
        double precioConIva = precioSinIva * (1 + IVA);

        System.out.println("El precio final es de " + precioConIva);

     }
}
