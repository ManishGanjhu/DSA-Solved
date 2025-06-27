
import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int l = 0 ;
        int r = arr.length-1;
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int a ,int b ){
        arr[a]= arr[a]^arr[b];
        arr[b]= arr[a]^arr[b];
        arr[a]= arr[a]^arr[b];
    }
}
