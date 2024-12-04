package biblioteca;

public class estaEnArrayInt {
    public static String estaEnArrayInt(int[] n,int num){
        String esta="";
        for (int i = 0; i < n.length; i++) {
            if (n[i]==num) {
                esta="El numero esta";
                break;
            }else{
                esta="El numero no esta";
            }
        }
        return esta;
    }

}
