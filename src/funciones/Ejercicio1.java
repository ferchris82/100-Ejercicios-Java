package funciones;

public class Ejercicio1 {
    
    /* 
     * Crear una función que me devuelva la suma del 1 al número pasado
     * por parámetro (este incluido).
     */
    public static void main(String[] args) {

        int n = 10;

        // 1° Forma de llamada
        int res = suma1N(n);
        System.out.println(res);

        // 2° Forma de llamada
        System.out.println(suma1N(n));
    }

    public static int suma1N(int n){

        int suma = 0;

        for(int i = 1; i<= n; i++){
            suma += i;
        }
        return suma;
    }
}
