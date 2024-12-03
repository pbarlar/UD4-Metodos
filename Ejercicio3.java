import java.util.Scanner;

public class Ejercicio3 {

    public static void linea(char caracter, int repeticiones){
        for (int i = 0; i < repeticiones; i++) {
            for (int j = 0; j < repeticiones-i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la altura de la figura: ");
        int altura=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el caracter que vas a utilizar: ");
        String caracter=entrada.nextLine();
        System.out.println();
        char carac=caracter.charAt(0);
        linea(carac, altura);
    }
}
