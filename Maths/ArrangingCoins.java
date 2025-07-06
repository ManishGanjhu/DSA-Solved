public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(completeRows(n));
    }
    public static int completeRows(int n ){
         int l = 0 ;
        int r = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            int coins = mid*(mid+1)/2;
            if(coins==n){
                return mid;
            }else if(coins<n){
                l=mid+1;
            }else {
                r = mid-1;
            }
        }
    return r;

    }
}
