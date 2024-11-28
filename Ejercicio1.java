import java.util.Scanner;

public class Ejercicio1 {

    public static String convierteEnPalotes(int n){
        String converter=Integer.toString(n);
        char letra=' ';
        String convierteletra="";
        for (int i = 0; i < converter.length(); i++) {
            letra=converter.charAt(i);
            switch (letra) {
                case '0':
                    convierteletra=convierteletra+"-";
                    break;
                
                case '1':
                convierteletra=convierteletra+"|-";
                    break;
                case '2':
                convierteletra=convierteletra+"||-";
                    break;
            
                case '3':
                convierteletra=convierteletra+"|||-";
                    break;
                case '4':
                convierteletra=convierteletra+"||||-";
                    break;
                case '5':
                convierteletra=convierteletra+"|||||-";
                    break;
                case '6':
                convierteletra=convierteletra+"||||||-";
                    break;
                case '7':
                convierteletra=convierteletra+"|||||||-";
                    break;
                case '8':
                convierteletra=convierteletra+"||||||||-";
                    break;
                case '9':
                convierteletra=convierteletra+"|||||||||-";
                    break;
            }
        }
        return convierteletra;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Dime un numero y lo convertire en palotes: ");
        int numero1=entrada.nextInt();
        System.out.println(convierteEnPalotes(numero1));
    }
}