public class PowerOftwo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(power2( n));
    }
    public static boolean power2(int n){
        return (n&(n-1))==0;
    }
}
