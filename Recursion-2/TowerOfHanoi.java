public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,'A','B','C');
    }
    public static void hanoi(int n , char source ,char helper,char destination ){
        if(n<=0){
            return ;
        }
        hanoi(n-1,source,destination,helper);
        System.out.println("Move "+(n)+" from "+source+" to "+destination);
        hanoi(n-1,helper,source,destination);

    }
}
