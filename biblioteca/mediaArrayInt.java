package biblioteca;

public class mediaArrayInt {
    public static int mediaArrayInt(int[] n){
        int media=0, num=0;
        for (int i = 0; i < n.length; i++) {
            num+=n[i];
        }
        media=num/n.length;
        return media;
    }
}
