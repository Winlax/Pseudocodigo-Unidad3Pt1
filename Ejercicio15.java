import java.util.*;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double numero;

        System.out.println("Ingresa un numero:");
        numero = teclado.nextDouble();

        if (numero == 0) {

            System.out.println("El numero ingresado es NULO");

        } else if (numero > 0) {

            System.out.println("El numero ingresado es POSITIVO");

        } else {
            
            System.out.println("El numero ingresado es NEGATIVO");
            
        }
    }
}