
public class NimGame {
    public static void main(String[] args) {
        /*You are playing the following Nim Game with your friend:

Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.

  */
        int n = 5;
        System.out.println(canWin(n));
    }
    public static boolean canWin(int n){
        return n%4!=0;
    }
}
