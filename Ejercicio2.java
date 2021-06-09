import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String capital, pais;

        System.out.println("Ingrese un pais:");
        pais = teclado.nextLine();

        System.out.println("Ingrese la capital del pais:");
        capital = teclado.nextLine();

        System.out.println(capital+" es la capital de "+pais);

    }
}