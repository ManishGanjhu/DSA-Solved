
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,1,2,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int arr[]){
        int n = arr.length;
         // we have to start from second element cause start is already sorted
         for(int i = 1 ; i < n;i++){
            int curr = arr[i]; // element to insert
            int j = i-1;

            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j]; // shift element right
                j--;// move left
            }
            // insert current at the right position
            arr[j+1]=curr;

            // check the track
            // System.out.println(Arrays.toString(arr));
         }
    }
}
