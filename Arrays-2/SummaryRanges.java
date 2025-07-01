import java.util.*;
public class SummaryRanges {
    public static void main(String[] args) {
        int [] nums={0,1,2,4,5,7};
        System.out.println(ranges(nums));
    }
    public static List<String> ranges(int nums[]){
        List <String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0 ;
        while(i<n){
            int start = nums[i];
            StringBuilder sb = new StringBuilder("");
            sb.append(start);
            // move foreard checking continuous
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            // if end != start , its range 
            if(nums[i]!= start){
                sb.append("->").append(nums[i]);
            }
            list.add(sb.toString());
            i++;
        }
        return list;
    }
}
