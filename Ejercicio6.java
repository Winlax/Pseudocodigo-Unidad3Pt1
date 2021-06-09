import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio;
        double numeroAumentado;
        int min = 0;
        int max = 200;

        numeroAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("El numero generado es: "+numeroAleatorio);

        numeroAumentado = numeroAleatorio * 1.3;

        System.out.println("El numero aumentado 30% es: "+numeroAumentado);
        
    }
}