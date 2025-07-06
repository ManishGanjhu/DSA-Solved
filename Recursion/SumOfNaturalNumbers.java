
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        sumN(n,0);
    }    
    public static void sumN(int n ,int sum){
        if(n==0){
            System.out.println(sum);
            return ;
        }
        sumN(n-1,sum+n);
    }
}
