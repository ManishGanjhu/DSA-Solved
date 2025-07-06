
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,3,4,5,2,6,8};
        int target = 2;
        System.out.println(firstOcc(arr,target,0));
        System.out.println(lastOcc(arr,target,arr.length-1));
    }
    public static int firstOcc(int arr[],int target,int s){
        if(s==arr.length){
            return -1;
        }
        if(arr[s]==target){
            return s;
        }
        return firstOcc(arr,target,s+1);
    }
    public static int lastOcc(int arr[],int target,int e){
        if(e<0){
            return -1;
        }
        if(arr[e]==target){
            return e;
        }
        return lastOcc(arr,target,e-1);
    }
}
