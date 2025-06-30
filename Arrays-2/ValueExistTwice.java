public class ValueExistTwice {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4,2,2};
        System.out.println(twice(nums));
    }
    public static boolean twice(int nums[]){
        for(int i = 0 ; i < nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
