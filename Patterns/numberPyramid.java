public class numberPyramid {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j <n-1-i;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
