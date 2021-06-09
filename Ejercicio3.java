import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, doble, triple;

        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();

        doble = 2 * numero;
        triple = 3 * numero;

        System.out.println("El doble de "+numero+" es: "+doble);
        System.out.println("El triple de "+numero+" es: "+triple);

    }
}