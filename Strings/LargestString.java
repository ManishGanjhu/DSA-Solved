
import java.util.Arrays;


public class LargestString {
    public static void main(String[] args) {
        String[] words = {
            "apple", "banana", "Zebra", "dog", "cat",
            "Ant", "ant", "Hello", "hello", "xyz",
            "123", "", "applepie", "banana", "Dog"
        };
        // Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(words);
        System.out.println(words[words.length-1]);
    }
}
