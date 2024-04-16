package Arrays;

public class PersonaMayor {
    
    /* 
     * Teniendo un array de String con el nombre de personas y otro de
     * números con su edad, indicar quien es la persona más mayor.
     */

     public static void main(String[] args) {
        String [] nombres = {"Karina", "Gloria", "Johanna", "Lina"};
        int [] edades = {28,31,20,23};

        int edadMayor = edades[0];
        int posicionMayor = 0;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i]> edadMayor) {
                edadMayor = edades[i];
                posicionMayor = i;
            }
        }

        System.out.println("La persona más mayor es " + nombres[posicionMayor]+" con " + edadMayor);
     }
}
