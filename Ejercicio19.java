import java.util.*;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio, min, max;
        double residuo;
        min = 1;
        max = 1000;

        numeroAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroAleatorio);

        residuo = numeroAleatorio % 5;

        if (residuo == 0) {

            if ((numeroAleatorio / 5) <= 25) {

                System.out.println("<< CORRECTO >>");

            } else {

                System.out.println("<< INCORRECTO >>");

            }
        } else {

            System.out.println("<< INCORRECTO >>");

        }
    } 
}