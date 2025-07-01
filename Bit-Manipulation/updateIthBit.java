
public class updateIthBit {
    public static void main(String[] args) {
        int n = 45;
        int i = 4;
        System.out.println(update(n,i));
    }    
    public static int update(int n ,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
}
