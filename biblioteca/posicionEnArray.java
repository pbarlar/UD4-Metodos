package biblioteca;

public class posicionEnArray {
    public static int posicionEnArray(int[] n, int num){
        int posicion=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]==num) {
                posicion=i;
                break;
            }else{
                posicion=-8;
            }
        }
        return posicion;
    }
}
