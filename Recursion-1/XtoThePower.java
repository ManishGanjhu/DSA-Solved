
public class XtoThePower {
    public static void main(String[] args) {
        int x = 4 ,n =3;
        System.out.println(toPow(x,n));
    }
    public static int toPow(int x ,int n ){
        if(n==0){
            return 1;
        }if(n==1){
            return x;
        }
        int half = toPow(x,n/2);
        if((n&1)==1){
            return half*half*x;
        }else{
            return half*half;
        }
    }
}
