import java.util.*;
public class AllIndicesOfKey {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,4,5};
        int key = 5;
        List<Integer> indices = new ArrayList<>();
        indic(arr,0, key, indices);

    }
    public static void indic(int arr[],int i ,int key,List<Integer> indices){
        if(i==arr.length){
            System.out.println(indices);
            return;
        }
        if(arr[i]==key){
            indices.add(i);
        }
        indic(arr,i+1,key,indices);
    }
}
