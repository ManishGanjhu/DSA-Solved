public class SortedAndRotatedArraySearch {
    public static int search(int arr[] ,int target){
        int si = 0 ; 
        int ei = arr.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            // check left if sorted
            if(arr[si]<arr[mid]){
                if(arr[si]<=target && target<arr[mid]){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }else{
                if(arr[mid]<target && target<=arr[ei]){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Simple rotated array
int[] arr = {4,5,6,7,0,1,2};  
int target = 0;   // Expected output: 4  
// int target = 3;   // Expected output: -1 (not found)  
System.out.println(search(arr,target));

    }
}
