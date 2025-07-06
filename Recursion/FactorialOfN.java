
public class FactorialOfN {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact(n));
    }
    public static int fact(int n ){
        if(n<2){
            return 1;
        }
        return fact(n-1)*n;
    }
}
