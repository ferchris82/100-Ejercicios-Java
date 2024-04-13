package funciones;

public class GenerarPassword {
    
    /* 
     * Crea una función que genere una password aleatoriamente con letras
     * mayúsculas, minúsculas y números.
     * Pasale por parámetro la longitud del password.
     */

     public static void main(String[] args) {
        System.out.println(generaPassword(60));
     }

     public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo-minimo+1) + (minimo));
     }

     public static char generaMayusculaAleatoria(){
        return (char) generarNumeroAleatorio(65, 90);
     }

     public static char generaMinusculaAleatoria(){
        return (char) generarNumeroAleatorio(97, 122);
     }

     public static String generaPassword(int longitud){
        String password = "";

        int eleccion;
        for(int i = 0; i<longitud; i++){
            
            eleccion = generarNumeroAleatorio(1, 3);

            switch (eleccion) {
                case 1 -> password += generarNumeroAleatorio(0, 9);
                case 2 -> password += generaMayusculaAleatoria();
                case 3 -> password += generaMinusculaAleatoria();
            }
        }
        return password;
     }
}
