
public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0};
        System.out.println(isSorted(arr,0,arr.length-1));
    }    
    public static boolean isSorted(int arr[],int s,int e){
            if(s==e){
                return true;
            }
            if(arr[s]<arr[s+1]){
                return isSorted(arr,s+1,e);
            }
            return false;
    }
}
