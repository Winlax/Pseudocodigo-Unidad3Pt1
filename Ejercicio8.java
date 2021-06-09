import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        double promedio;

        System.out.println("Ingrese un numero");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese un numero");
        numero2 = teclado.nextInt();

        System.out.println("Ingrese un numero");
        numero3 = teclado.nextInt();

        promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de los numeros es: "+promedio);

    }
}