public class SearchInASortedMatrix {
    public static boolean search(int matrix[][],int target){
        int r = matrix.length-1;
        int c = 0;
        while(r>=0 && c<=matrix[0].length-1){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                c++;
            }else{
                r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
    {1, 3, 5},
    {7, 9, 11},
    {13, 15, 17}
};
    System.out.println(search(matrix,5));
    }
}
