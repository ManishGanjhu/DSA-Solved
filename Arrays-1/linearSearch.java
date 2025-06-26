

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,8,7,6};
        System.out.println(linear(arr,9));
    }
    public static int linear(int arr[],int key ){
        int i = 0 ;

        while(i<arr.length){
            if(arr[i]==key){
                return i;
            }
            i++;
        }
        return -1;
    }
}
