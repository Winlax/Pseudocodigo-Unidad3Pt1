import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String palabraA, palabraB, palabraC;

        System.out.println("Ingrese 1ra. palabra:");
        palabraA = teclado.nextLine(); 

        System.out.println("Ingrese 2da. palabra:");
        palabraB = teclado.nextLine();

        palabraC = palabraA;
        palabraA = palabraB;

        System.out.println("La 1ra. palabra es: "+palabraA);
        System.out.println("La 2da. palabra es: "+palabraC);
        
    }
}