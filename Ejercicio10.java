import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double base, altura, area, perimetro;

        System.out.println("Ingrese la base:");
        base = teclado.nextDouble();

        System.out.println("Ingrese la altura:");
        altura = teclado.nextDouble();

        area = base * altura;
        perimetro = 2 * base + 2 * altura;

        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        
    }
}