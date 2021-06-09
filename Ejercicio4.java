import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, cuadrado, cubo;

        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();

        cuadrado = numero * numero;
        cubo = cuadrado * numero;

        System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
        System.out.println("El cubo de "+numero+" es: "+cubo);

    }
}