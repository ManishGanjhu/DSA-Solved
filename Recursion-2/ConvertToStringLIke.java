import java.util.*;
public class ConvertToStringLIke {
    public static void main(String[] args) {
        int n = 2019;
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        StringBuilder sb = new StringBuilder ("");
        // String str = "";
        // convert(n, map, str);
        converts(n, map, sb);
        System.out.println(sb);
    }
    // public static void convert(int n ,Map<Integer,String> map,String str){
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     str = map.get(n%10) +" "+str;
    //     convert(n/10,map,str);
        
    // }
    // with stringbuilder // also called post processing recursion
    public static void converts(int n, Map<Integer, String> map, StringBuilder sb) {
        if (n == 0) return;

        converts(n / 10, map, sb); // Process left digits first (MSB to LSB)

        sb.append(map.get(n % 10)).append(" ");
    }
}
