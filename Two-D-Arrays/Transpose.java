
import java.util.*;
public class Transpose {
    public static void main(String args[]){
     int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
    //    System.out.println(Arrays.deepToString(mat));         
    //    System.out.println(Arrays.deepToString(trans(mat)));
            printMatrix(trans(mat));
    
    }
    // to print matrix
    public static void printMatrix(int[][] mat) {
    for (int[] row : mat) {
        System.out.println(Arrays.toString(row));
    }
}
// Returns a transpose of matrix
    public static int[][] trans(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;

        int tra[][] = new int[c][r];

        for(int i = 0 ; i < mat.length;i++){
            for(int j = 0 ; j < mat[0].length;j++){
                tra[j][i]=mat[i][j];
            }
        }
        return tra;
    }
}
