public class FastExponentiation {
    public static void main(String[] args) {
        int a = 3;
        int n = 4;
        System.out.println(fastExpo(a,n ));
    }
    public static int fastExpo(int a ,int n ){
        int product = 1;

        while(n>0){
            if((n&1)==1){
                product*=a;
            }
            a*=a;
            n>>=1;
        }
        return product;
    }
}
