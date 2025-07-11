
import java.util.Arrays;


public class MergeSortArrayOfStrings {
    public static void main(String[] args) {
        String[] names = {"zebra", "apple", "mango", "banana"};
        divideSort(names,0,names.length-1);
        System.out.println(Arrays.toString(names));
    }    
    public static void divideSort(String names[],int si ,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si)/2;
        //left 
        divideSort(names,si,mid);
        // right
        divideSort(names,mid+1,ei);
        // merge
        combine(names,si,mid,ei);

    }
    public static void combine(String names[],int si ,int mid,int ei){
        String arr[]=new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0 ;
        
        while(i<=mid && j<=ei){
            if(names[i].compareTo(names[j])<0){
                arr[k++]=names[i++];
            }else{
                arr[k++]=names[j++];
            }
        }
        while(i<=mid){
            arr[k++]=names[i++];
        }while(j<=ei){
            arr[k++]=names[j++];
        }
        for(i=si,k=0;k<arr.length;i++,k++){
            names[i]=arr[k];
        }
    }
}
