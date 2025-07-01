import java.util.*;
public class DisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Mark seen indices as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;         // Get index from value
            nums[index] = -Math.abs(nums[index]);      // Mark it negative
        }

        // Step 2: Collect indices that are still positive (i+1 = missing number)
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}

