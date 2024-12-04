package ;
import biblioteca.generaArrayInt;
import java.util.Scanner;



public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime el numero que quieres que tenga el array: ");
        int n=entrada.nextInt();
        System.out.println("El array creado es: "+generaArrayInt(n));
    }
}
