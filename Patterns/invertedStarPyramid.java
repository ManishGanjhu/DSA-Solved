public class invertedStarPyramid {
    public static void main(String[] args) {
        int n = 7 ; 
        for (int i = 0 ; i < n ;i++){
            // space
            for (int j = 0 ; j < i ;j++){
                System.out.print("  ");
            }
            //stars
            //5*2-(i*2+1)
            //10-1 ie i = 0 
            //10-7 ie i = 1
            for(int j =n*2-(i*2+1);j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
