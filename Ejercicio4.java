public class Ejercicio4 {

    public static String convierteEnArray(int[] a){
        String conversion="";
        for (int i = 0; i < a.length; i++) {
            conversion+=a[i];
        }
        return conversion;
    }


    public static void main(String[] args) {
        int[] a={8,3,4,2,1};
        System.out.println(convierteEnArray(a));
    }
}
