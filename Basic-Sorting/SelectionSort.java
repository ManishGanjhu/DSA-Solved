
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        // System.out.println(Arrays.toString(arr));
    }
    public static void selection(int arr[]){
        for(int i = 0 ; i< arr.length-1;i++){
            // initialize the minimum index
            int minidx = i;
            for(int j = i+1;j<arr.length;j++){
                // check if any other element is smaller and set the mindx if it is
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            // if minidx is changed then we need to swap 
            if(minidx!=i){
                int temp = arr[i];
                arr[i] = arr[minidx];
                arr[minidx]=temp;
            }
            // we can print the array to trace the swapping while sorting
            System.out.println("After pass"+(i+1)+" "+Arrays.toString(arr));
        }
    }
}
