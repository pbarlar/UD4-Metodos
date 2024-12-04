package biblioteca;

public class generaArrayInt {
    public static int[] generaArrayInt(int n){
        int generador[]=new int[n];
        for (int i = 0; i < n; i++) {
            generador[i]=(int)(Math.random()*101);
        }
        return generador;

    }
    
}
