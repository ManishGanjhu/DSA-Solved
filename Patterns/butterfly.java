public class butterfly {
    public static void main(String[] args) {
        int n = 5 ; 
        //upper half
        for (int i = 0 ;i<n;i++){
            for(int j = 0 ;j<i+1;j++){
                System.out.print("*");
            }
            for(int j = n*2-(i*2+2);j>0;j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half 
        for (int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n-i;j++){
                System.out.print("*");
            }
            for(int j = 0 ;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
