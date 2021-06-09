import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, numeroSiguiente;

        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();

        numeroSiguiente = numero + 1;

        System.out.println("El numero siguiente es: "+numeroSiguiente); 
    }
}