public class ContiguousStrings {
    public static void main(String[] args) {
        String str = "abcabcbb";
        printStrings(str,0,1);
    }
    public static void printStrings(String str,int si ,int ei  ){
        if(si == str.length()){
            return ;
        }
            
        if(ei>str.length()){
            printStrings(str,si+1,si+2);
        }else{
            String newStr = str.substring(si,ei);
            if(newStr.charAt(0)==newStr.charAt(newStr.length()-1)){
                System.out.println(newStr);
            }
            printStrings(str,si,ei+1);
        }
    }

}
