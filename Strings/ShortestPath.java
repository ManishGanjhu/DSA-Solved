
public class ShortestPath {
    public static void main(String[] args) {
        String moves = "EEEEEEEE";
        System.out.println(path(moves));
    }
    public static int path(String moves){
        int x = 0 ;
        int y = 0 ;
        int i = 0 ;
        while(i<moves.length()){
            if(moves.charAt(i)=='N'){
                y++;
            }if(moves.charAt(i)=='S'){
                y--;
            }if(moves.charAt(i)=='E'){
                x++;
            }if(moves.charAt(i)=='W'){
                x--;
            }
            i++;
        }
        int d =(int) Math.round(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        return d;
    }
}
