import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 8, 12, 4, 6};
        int target = 10;

        System.out.println(Arrays.toString(two(nums,target)));
    }
    // two sum approach 
    // array should be sorted so to return the original index hashmap is used 
    public static int[] find(int nums[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int l = 0 ;
        int r = nums.length-1;
        // we need distinct elements thats why l<r
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum==target){
                // return new int[]{nums[l],nums[r]};
                return new int[]{map.get(nums[l]),map.get(nums[r])};
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{};
    }
    // only done using hashmap , no sorting , using the complement 
    public static int[] two(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>(); // num → index

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i]; // 💡 the number we need to find

        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i}; // 🔥 Found the pair
            // return new int[]{complement, nums[i]}; // 🔥 Found the pair of values 
        }

        map.put(nums[i], i); // store current number and its index
    }

    return new int[]{}; // No pair found (won't happen in LeetCode 1)
}

}
