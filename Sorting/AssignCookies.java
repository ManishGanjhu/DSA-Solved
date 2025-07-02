
import java.util.Arrays;


public class AssignCookies {
    public static void main(String[] args) {
        int g[]={1,2};
        int s [] ={1,2,3};
        System.out.println(gratified(g,s));
    }
    public static int gratified(int g[],int s[]){
        Arrays.sort(g);
        Arrays.sort(s);
        int chi = 0;
        int coo = 0;
        while(chi<g.length && coo<s.length){
            if(s[coo]>=g[chi]){
                chi++;
            }
            coo++;
        }
        return chi;
    }
}
