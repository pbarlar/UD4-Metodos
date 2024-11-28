import java.util.Scanner;

public class Ejercicio1 {

    public static String convierteEnPalotes(int n) {
        String converter = Integer.toString(n);
        int valorLetra = 0;
        String conversion = " ";
        for (int i = 0; i < converter.length(); i++) {
            valorLetra = converter.charAt(i) - 48;
            for (int j = 0; j < valorLetra; j++) {
                if (valorLetra == 0) {
                    conversion = conversion + "-";
                } else {
                    conversion = conversion + "|";
                }
            }
            
            conversion=conversion+"-";
        }
        return conversion;
    }

    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un numero y lo convertire en palotes: ");
        int numero1 = entrada.nextInt();
        System.out.println(convierteEnPalotes(numero1));
    }
}