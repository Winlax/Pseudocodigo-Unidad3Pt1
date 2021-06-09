import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double Celsius, Far;

        System.out.println("Ingrese temperatura en C°");
        Celsius = teclado.nextDouble();

        Far = ( Celsius * (9/5) ) + 32;

        System.out.println(Far+" F°");

    }
}