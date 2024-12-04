package biblioteca;

public class volteaArrayInt {
    public static int[] volteaArrayInt(int[] n){
        int[] arrayVolteado=new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arrayVolteado[i]=n[(n.length-i)-1];
        }
        return arrayVolteado;
    }
}
