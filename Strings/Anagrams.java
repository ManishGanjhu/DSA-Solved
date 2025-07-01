import java.util.*;
public class Anagrams{
    public static void main(String[] args) {
        String str1 = "race";
        String  str2 = "care";
        System.out.println(areAnagrams(str1,str2));
    }
    public static boolean areAnagrams(String str1,String str2){
       char sc1[] = str1.toCharArray();
       char sc2[] = str2.toCharArray();
       Arrays.sort(sc1);
       Arrays.sort(sc2);
       return Arrays.equals(sc1,sc2);
    }
}