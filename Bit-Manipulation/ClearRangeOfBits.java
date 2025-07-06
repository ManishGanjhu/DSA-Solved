public class ClearRangeOfBits {
    public static void main(String[] args) {
        int n = 45;
        int i = 2,j=5;
        System.out.println(rangeOf(n,i,j));
    }
    public static int rangeOf(int n ,int i ,int j){
            int a = (-1)<<(j+1);
            int b = (1<<i)-1;
            int bitmask = a|b;
            return n&bitmask;
    }
}
