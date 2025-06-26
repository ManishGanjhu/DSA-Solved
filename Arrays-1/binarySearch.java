
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,40,8,7,9,10,45,67};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length;i++){
            map.put(arr[i],i);
        }
        // binary search works in sorted arrays 
        System.out.println(binary(arr,40,map));
    }
    public static int binary(int arr[],int target,Map<Integer,Integer> map){
        Arrays.sort(arr);
        int l = 0 ;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                return map.get(arr[mid]);
            }else if(arr[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}
