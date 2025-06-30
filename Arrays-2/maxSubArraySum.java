public class maxSubArraySum {
    public static void main(String[] args) {
        int nums[]={1,2,3,-4,0};
        // kadanes algorithm 
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length;i++){
            cs+=nums[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println(ms);
    }
}
