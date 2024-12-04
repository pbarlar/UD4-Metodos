package biblioteca;

public class minimoArrayInt {
    public static int minimoArrayInt(int[] n){
        int ganador=n[0];
        for (int i = 0; i < n.length; i++) {
            if (ganador>n[i]) {
                ganador=n[i];
            }
        }
        return ganador;
    }
}
