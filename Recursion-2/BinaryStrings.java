public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        bins(n,"",0);
    }
    public static void bins(int n ,String s,int ld ){
        if(n==0){
            System.out.println(s);
            return;
        }
        bins(n-1,s+"0",0);
        if(ld==0){
            bins(n-1,s+"1",1);
        }
    }
}
// UNderstand the recursion Tree
/*Level 0 (start)
("", last=0, n=3)
|
├── "0", last=0, n=2
|   |
|   ├── "00", last=0, n=1
|   |   |
|   |   ├── "000" ✅
|   |   └── "001" ✅
|   |
|   └── "01", last=1, n=1
|       |
|       └── "010" ✅     (Can't do "011" because last=1)
|
└── "1", last=1, n=2
    |
    └── "10", last=0, n=1
        |
        ├── "100" ✅
        └── "101" ✅
 */
