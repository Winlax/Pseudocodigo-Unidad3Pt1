import java.util.*;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double denominador, numerador, residuo;

        System.out.println("Ingrese numerador:");
        numerador = teclado.nextDouble();

        System.out.println("Ingrese denominador:");
        denominador = teclado.nextDouble();

        residuo = numerador % denominador;

        if (residuo == 0) {
            
            System.out.println("Es divisible!");

        } else {

            System.out.println("No es divisible...");
            
        }
    }
}