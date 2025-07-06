
public class IncreasingDecreasing {
    public static void main(String[] args) {
        int n = 5 ;
        // incr(n);
        decr(n);
    }
    public static void incr(int n ){
        if(n==0){
            return;
        }
        incr(n-1);
        System.out.println(n);
    }

    public static void decr(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        decr(n-1);
    }
}
