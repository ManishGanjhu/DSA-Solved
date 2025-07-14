import java.util.*;
// i have not solved it using the divide and conquer :( but it works
public class MajorityElement {
    public static void main(String[] args) {
        // Assume that majority elem always exist 
        int arr[]={2,1,3,2,2,3,2,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}
