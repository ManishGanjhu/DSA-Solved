
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(three(nums));
    }
    public static List<List<Integer>> three(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            // skip duplicate for fixed elements
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    // skip duplicates for l
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    // skip duplicates for r
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    // the normal iteration
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return triplets;
    }
}
