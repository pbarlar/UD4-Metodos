package biblioteca;

public class maximoArrayInt {
    public static int maximoArrayInt(int[] n){
        int ganador=n[0];
        for (int i = 0; i < n.length; i++) {
            if (ganador<n[i]) {
                ganador=n[i];
            }
        }
        return ganador;
    }
}
