import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fb(n));
    }
    public static List<String> fb(int n) {
        
        String arr[]=new String[n];
        for(int i = 1 ; i<=n ; i++){
            if((i%3==0) && (i%5==0)){
                arr[i-1]="FizzBuzz";
            } else if((i)%3==0){
                arr[i-1]="Fizz";
            }else if((i)%5==0){
                arr[i-1]="Buzz";
            }else{
                arr[i-1]=Integer.toString(i);
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}
