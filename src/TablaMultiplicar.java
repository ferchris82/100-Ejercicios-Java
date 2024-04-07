import java.util.Scanner;

public class TablaMultiplicar {

    //  Pedir un número por consola y mostrar la tabla del 10 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un número ");
        int num = sc.nextInt();

        System.out.println("La tabla de multiplicar del 10 es: ");
        for(int i = 0; i<=10; i++){
            int resultado = num*i;
            System.out.println(num + "x" + i + "= " + resultado);
        }
    }

}
