public class palindromic {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n-1-i;j++){
                System.out.print("  ");
            }
            for(int j = i+1;j>0;j--){
                System.out.print(j+" ");
            }
            int num = 2;
            for(int j = 0 ; j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
