import java.util.*;
public class RemoveDuplicatesInAString {
    public static void main(String[] args) {
        String str = "aaabbbacccddefff";
        List<Character> seen = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        System.out.println(removeDuple(str,0,sb,seen));
    }   
    public static String removeDuple(String str,int i ,StringBuilder sb,List<Character> seen ){
        if(i==str.length()){
            return sb.toString();
        }
        char ch =str.charAt(i);
        if(!seen.contains(ch)){
            seen.add(ch);
            sb.append(ch);
        }
        return removeDuple(str,i+1,sb,seen);
    }
}
