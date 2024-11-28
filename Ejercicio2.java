import java.util.Scanner;

public class Ejercicio2 {
    
    public static String convierteEnPalabras(int n){
        String palabras=Integer.toString(n);
        String[] letras={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        String resultado="";
        int valorletra=0;
        for (int i = 0; i < palabras.length(); i++) {
            valorletra=palabras.charAt(i)-48;
            resultado=resultado+letras[valorletra];
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indica un numero y te dire esos numeros en caracteres: ");
        int num1=entrada.nextInt();
        System.out.println("La cadena es: " +convierteEnPalabras(num1));
    }
}
