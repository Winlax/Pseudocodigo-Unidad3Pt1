import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio;
        double numeroReducido;
        int min = 10;
        int max = 50;

        numeroAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("El numero generado es: "+numeroAleatorio);

        numeroReducido = numeroAleatorio * 0.85;

        System.out.println("El numero reducido un 15% es: "+numeroReducido);
        
    }
} 