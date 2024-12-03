import java.util.Arrays;

public class Ejercicio5 {
    
    public static int[] concatena(int[] a,int[] b){
        int[] ab=new int[a.length+b.length];
        String cadena="";
        for (int i = 0; i < a.length; i++) {
            ab[i]=a[i];
        }
        
        for (int i = a.length; i < ab.length; i++) {
            ab[i]=b[i-a.length];
        }
        return Arrays.asList(ab);
    }
    
    
    public static void main(String[] args) {
        int[] a={8,9,0};
        int[] b={1,2,3};
        System.out.println(concatena(a, b));
    }
}
