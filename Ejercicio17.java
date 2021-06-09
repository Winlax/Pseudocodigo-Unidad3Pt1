import java.util.*;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Ingrese 1er. lado:");
        lado1 = teclado.nextInt();

        System.out.println("Ingrese 2do. lado:");
        lado2 = teclado.nextInt();

        System.out.println("Ingrese 3er. lado:");
        lado3 = teclado.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {

            System.out.println("Es un triangulo EQUILATERO");

        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {

            System.out.println("Es un triangulo ESCALENO");

        } else {

            System.out.println("Es un triangulo ISOCELES");

        }
    }
}