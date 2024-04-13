package funciones;

public class CuentaLetras {

    /* 
     * Crea una función que dado dos parámetros, siendo el primero un String 
     * y el segundo un boolean, cuente las letras minúsculas o mayúsculas, 
     * según el valor del segundo parámetro.
     * 
     * true = mayusculas, false = minusculas
     */

     public static void main(String[] args) {
        System.out.println(cuentaLetras("hOla", false));
     }

     public static int cuentaLetras(String frase, boolean mayus){

        int min, max, contador = 0;

        if(mayus){
            min = 65;
            max = 90;
        } else{
            min = 97;
            max = 122;
        }

        char caracter;
        for(int i = 0; i < frase.length(); i++){
            caracter = frase.charAt(i);
            if (caracter >= min && caracter <= max) {
                contador++;
            }
        }
        return contador;
     }
}
