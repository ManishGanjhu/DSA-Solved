    public class clearLastIBits {
        public static void main(String[] args) {
            int n = 45;
            int i = 3;
            System.out.println(clearLast(n,i));
        }
        public static int clearLast(int n ,int i){
            int bitmask = (-1)<<i;
            return n&bitmask;
        }
    }
