import java.util.*;
public class SpiralMatrix {
    public  static void main(String args[]){
    int[][] matrix = {
                    {1,  2,  3},
                    {4,  5,  6},
                    {7,  8,  9}
                                };
            System.out.println(spiral(matrix));                   

    }
    public static List<Integer> spiral(int matrix[][]){

        int sr = 0 ;
        int er = matrix.length-1;
        int sc = 0 ; 
        int ec = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(sr<=er && sc<=ec){
            // top
            for(int c = sc ; c<=ec;c++){
                list.add(matrix[sr][c]);
            }
            // right 
            for(int r = sr+1;r<=er;r++){
                list.add(matrix[r][ec]);
            }
            // bottom (only if rows remain )
            if(sr<er){
                for(int c = ec-1;c>=sc;c--){
                    list.add(matrix[er][c]);
                }
            }
            // left (only if columns remain)
            if(sc<ec){
                for(int r = er-1;r>=sr+1;r--){
                    list.add(matrix[r][sc]);
                }
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return list;
    }
}
