import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, total;

        System.out.println("Ingrese un numero");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese otro numero");
        numero2 = teclado.nextInt();

        total = numero1 + numero2;

        System.out.println("La suma de los numeros es: "+total);

    }
}