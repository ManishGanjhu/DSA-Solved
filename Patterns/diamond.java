public class diamond {
    public static void main(String[] args) {
        int n = 5 ; 
        for(int i = 0 ; i < n ;i++){
            //space 
            for(int j = 0 ; j <n-i-1;j++){
                System.out.print(" ");
            }
            // stars
            for(int j = i*2+1; j >0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n-1 ;i++){
            //space 
            for(int j = 0 ; j <i+1;j++){
                System.out.print(" ");
            }
            // stars
            for(int j = n*2-(i*2+1)-2; j >0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
