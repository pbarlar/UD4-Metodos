
import biblioteca.estaEnArrayInt;
import biblioteca.generaArrayInt;
import biblioteca.maximoArrayInt;
import biblioteca.mediaArrayInt;
import biblioteca.minimoArrayInt;
import biblioteca.posicionEnArray;
import biblioteca.volteaArrayInt;

import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio6 {
    public static void main(String[] args) {
        
        /*Apartado A */
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime el numero que quieres que tenga el array: ");
        int n=entrada.nextInt();
        
        System.out.println("El array creado es: "+Arrays.toString( generaArrayInt.generaArrayInt(n)));
        
        /*Apartado B */
        int[] n2={8,9,17,2,23,1};
        System.out.println("El minimo numero del array es "+minimoArrayInt.minimoArrayInt(n2));

        /*Apartado C */
        int[] n3={2,9,15,7,17,8,4,21};
        System.out.println("El maximo numero del array es "+maximoArrayInt.maximoArrayInt(n3));

        /*Apartado D */
        int[] n4={4,5,6,22,5,7};
        System.out.println("La media de los numeros del array es: "+mediaArrayInt.mediaArrayInt(n4));

        /*Apartado E */
        int[] n5={8,9,4,12,4,5};
        System.out.println("Dime el numero que quieres comprobar que esta en el array: ");
        int num=entrada.nextInt();
        System.out.println(estaEnArrayInt.estaEnArrayInt(n5, n));

        /*Apàrtado F */
        int n6[]={7,8,21,3,16,6};
        System.out.println("Dime el numero que quieres comprobar en que posición del array esta");
        int num2=entrada.nextInt();
        System.out.println("El numero que has introducido esta en la posicion: "+posicionEnArray.posicionEnArray(n6, num2));

        /*Apartado G */
        int n7[]={8,23,1,4,6,7,13};
        System.out.println("El array volteado es "+Arrays.toString(volteaArrayInt.volteaArrayInt(n7)));


    }
}
