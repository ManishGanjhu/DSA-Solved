
public class SetIthBit {
    public static void main(String[] args) {
        int a = 45;
        int i = 1 ;
        System.out.println(set(a,i));
    }
    public static int set(int a ,int i){
        int bitmask = 1<<i;
        return a|bitmask;
    }
}
