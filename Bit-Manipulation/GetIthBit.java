
public class GetIthBit {
    public static void main(String[] args) {
        int a = 33;
        int i = 5;
        int bitmask = 1<<i;
        if((a&bitmask)==0){
            System.out.println("0");
        }else{
            System.out.println(1);
        }
    }    
}
