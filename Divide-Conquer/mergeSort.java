
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {6,3,4,2,1,7,8,5,0};
        Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int arr[],int si ,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si)/2;
        Sort(arr,si,mid);
        Sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
        
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int newArr[]=new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0 ;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                newArr[k]=arr[i];
                i++;
            }else {
                newArr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            newArr[k++]=arr[i++];
        }
        while(j<=ei){
            newArr[k++]=arr[j++];
        }
        for(i=si,k=0;k<newArr.length;k++,i++){
            arr[i]=newArr[k];
        }
    }
}
