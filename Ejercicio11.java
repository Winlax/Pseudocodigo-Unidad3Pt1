import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double cm, yardas, metros, pies, pulgadas;

        System.out.println("Ingrese distancia en centimetros:");
        cm = teclado.nextDouble();

        yardas = cm / 91.44;
        metros = cm / 100;
        pies = cm / 30.48;
        pulgadas = cm / 2.54;

        System.out.println(yardas+" Yardas");
        System.out.println(metros+" m");
        System.out.println(pies+" ft");
        System.out.println(pulgadas+" in");

    }
}