
public class StringCompression {
    public static void main(String[] args) {
        String s = "aabccccca";
        System.out.println(compress(s));
    }
    public static String compress(String s){

        StringBuilder sb = new StringBuilder("");
        int count=1;
        for(int i = 1 ; i < s.length();i++){
            if(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1));
                if(count>1){
                    sb.append(count);      
                }
                count=1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }
}
