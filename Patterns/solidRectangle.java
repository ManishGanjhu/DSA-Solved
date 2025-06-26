import java.util.*;
public class solidRectangle{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no . = ");
        int n = sc.nextInt();
        // a program to print solid rectange pattern 
        for (int i = 0 ; i < n ;i++){
            for (int j = 0 ; j < n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}