import java.util.*;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] numeros = new String[5]; 
        int numero, num;

        System.out.print("Ingrese un numero de 5 cifras: ");
        numero = teclado.nextInt();
        num = Integer.toString(numero).length();

        if (num == 5) {

            for (int i = 0; i < num; i++) {

                numeros[i] = String.valueOf(Integer.toString(numero).charAt(i));
                
            }

            if (numeros[0].equals(numeros[4])) {

                if (numeros[1].equals(numeros[3])) {

                    System.out.println("<< Es capicia >>");

                } else {

                    System.out.println("<< No es capicia >>");
                }

            } else {

                System.out.println("<< No es capicia >>");

            }

        } else {

            System.out.println("Debe ingresar una cifra de 5 digitos...");

        }

    }
}