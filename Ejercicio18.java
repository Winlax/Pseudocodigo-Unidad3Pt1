import java.util.*;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String numero1, numero2, numero3, numero4;
        int numero, num, suma;
        suma = 0;

        System.out.println("Ingrese un numero maximo de 4 cifras:");
        numero = teclado.nextInt();
        num = Integer.toString(numero).length();

        if (num == 4) {

            for (int i = 0; i < num; i++) {

                    numero1 = String.valueOf(Integer.toString(numero).charAt(i));
                    System.out.println(numero1);
                    suma += Integer.parseInt(numero1);

            }

            System.out.println("Suma: "+suma);

        } else if (num == 3) {

            numero4 = "0";
            System.out.println("d1 = "+numero4);

            for (int i = 0; i < num; i++) {

                    numero1 = String.valueOf(Integer.toString(numero).charAt(i));
                    System.out.println("d"+(i+2)+" = "+numero1);
                    suma += Integer.parseInt(numero1);

            }
             
            System.out.println("Suma: "+suma);

        } else if (num == 2) {

            numero4 = "0";
            System.out.println("d1 = "+numero4);

            numero3 = "0";
            System.out.println("d2 = "+numero3);

            for (int i = 0; i < num; i++) {

                    numero1 = String.valueOf(Integer.toString(numero).charAt(i));
                    System.out.println("d"+(i+2)+" = "+numero1);
                    suma += Integer.parseInt(numero1);

            }
             
            System.out.println("Suma: "+suma);

        }  else if (num == 1) {

            numero4 = "0";
            System.out.println("d1 = "+numero4);

            numero3 = "0";
            System.out.println("d2 = "+numero3);

            numero2 = "0";
            System.out.println("d3 = "+numero2);

            numero1 = String.valueOf(Integer.toString(numero).charAt(0));
            System.out.println("d4 = "+numero1);
            suma = Integer.parseInt(numero1);
             
            System.out.println("Suma: "+suma);

        } else {

            System.out.println("Debe ingresar una cifra igual o menor de 4 digitos...");

        }
    }
}