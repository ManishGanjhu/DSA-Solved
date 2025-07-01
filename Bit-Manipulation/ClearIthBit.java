
public class ClearIthBit {
    public static void main(String[] args) {
        int a = 45;
        int i = 0;
        System.out.println(clear(a,i));
    }    
    public static int clear(int a ,int i){
        int bitmask = ~(1<<i);
        return (a&bitmask);
    }
}
