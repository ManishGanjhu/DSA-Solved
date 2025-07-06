public class FriendsPairing {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(waysto(n));
    }
    public static int waysto(int n ){
        if(n==0 || n==1){
            return 1;
        }
        int single = waysto(n-1);
        int pair = (n-1)*waysto(n-2);
        return single+pair;
    }
}
