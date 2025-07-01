
public class FirstLetterToUpper {
    public static void main(String[] args) {
        String s = "my name is boka chan";
        System.out.println(title(s));
    }
    public static String title(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length();i++){

            if(i==0 || s.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
