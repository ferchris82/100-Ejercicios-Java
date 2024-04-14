package Arrays;

public class SumaMediaArray {
    /* 
     * Crea un array de números (dale los valores tu mismo) e indica
     * cual es la suma y la media de ese array
     */
    public static void main(String[] args) {
        
        int[]numeros = {3,5,6};

        int suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es " + suma);

        media = (double)suma / numeros.length; 

        System.out.println("La media es " + media);
    }

}
