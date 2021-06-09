import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double radio, altura, pi, volumen;
        pi = Math.PI;

        System.out.println("Ingrese el radio:");
        radio = teclado.nextDouble();

        if (radio >= 0) {

            System.out.println("Ingrese la altura:");
            altura = teclado.nextDouble();

            if (altura >= 0) {

                volumen = pi * radio * radio * altura;

                System.out.println("El volumen del cilindro es: "+volumen);

            } else {

                System.out.println("La altura debe ser igual o mayor a 0...");

            }

        } else {

            System.out.println("El radio debe ser igual o mayor a 0...");

        }
    }
}