import java.util.*;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Ingrese 1er. numero:");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese 2do. numero:");
        numero2 = teclado.nextInt();

        System.out.println("Ingrese 3er. numero:");
        numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {

            System.out.println("El numero mayor es: "+numero1);

        } else if (numero2 > numero1 && numero2 > numero3) {

            System.out.println("El numero mayor es: "+numero2);

        } else {

            System.out.println("El numero mayor es: "+numero3);

        }
    }
}