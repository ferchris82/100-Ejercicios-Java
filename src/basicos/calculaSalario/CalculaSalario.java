package basicos.calculaSalario;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {
    /* 
     * Pide un salario base por consola y su puesto por consola.
     * Calcula su sueldo sabiendo lo siguiente:
     * 
     * Si es vendedor, cobra 500 euros más.
     * Si es director, cobra 1000 euros más.
     * Si es conserje, cobra 100 euros más.
     * 
     * Utiliza un enumerado para almacenar los tipos de puesto de trabajo.
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el salario base: ");
        double salarioBase = sc.nextDouble();

        sc.nextLine();

        System.out.println("Escribe un puesto de trabajo");
        String profesion = sc.nextLine().toUpperCase().trim();

        boolean existe = false;
        for(PuestoTrabajo p:PuestoTrabajo.values()){
            if(profesion.equals(p.name())){
                existe = true;
            }
        }

        if(existe){

            double salarioFinal = salarioBase;
            PuestoTrabajo p = PuestoTrabajo.valueOf(profesion);

            switch (p) {
                case VENDEDOR -> salarioFinal += 500;
                case DIRECTOR -> salarioFinal += 1000;
                case CONSERJE -> salarioFinal += 100;          
            }
            System.out.println("El salario final es " + salarioFinal);

        } else{
            System.out.println("Esa profesión no lo puedo encontrar");
        }      
     }

     
}
