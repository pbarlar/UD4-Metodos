package biblioteca;

public class generaArrayInt {
    public static int[] generaArrayInt(int n){
        int generador[]=new int[n];
        for (int i = 0; i < generador.length; i++) {
            generador[i]=(int)Math.random()*100;
        }
        return generador;

    }
    
}
