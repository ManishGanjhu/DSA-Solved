
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        // Expected: [1, 2, 3, 4, 5]
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int arr[]){
        /*| Loop      | What It Does                 | Why It Stops Early            |
| --------- | ---------------------------- | ----------------------------- |
| Outer `i` | Tracks number of full passes | Only `n-1` passes are needed  |
| Inner `j` | Compares adjacent pairs      | `n - i - 1` skips sorted tail |
*/ 
        for(int i = 0 ; i < arr.length-1;i++){
            for(int j = 0 ; j < arr.length-i-1;j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
}
