public class AddStrings {
    public static void main(String[] args) {
        String num1 = "455";
        String num2 = "775";
        System.out.println(addstr(num1,num2));
    }
    public static String addstr(String num1,String num2){
           StringBuilder sb =  new StringBuilder ("");
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0 ;
        while(i>=0 || j>=0 || carry>0){
            int d1 = (i>=0)? num1.charAt(i--)-'0':0 ;
            int d2 = (j>=0)? num2.charAt(j--)-'0':0 ;
            int sum = d1 +d2 +carry;
            sb.append(sum%10);
            carry = sum/10;
        }
      return  sb.reverse().toString();
    }
    }

