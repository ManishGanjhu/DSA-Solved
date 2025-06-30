public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    public static int search(int arr[],int target){
        // use a modified binary search 
        int l = 0 ;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            // checks if target is at mid
            if(arr[mid]==target){
                return mid;
            }// checks if left part is sorted and inside runs a binary search
            if(arr[l]<arr[mid]){
                //check if present in left
                if(arr[l]<=target && target<arr[mid]){
                    r=mid-1;
                }else{
                    l = mid+1;
                }
            }
            // right part is sorted 
            else{
                // check if present right
                if(arr[mid]<target && target<=arr[r]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
