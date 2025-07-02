import java.util.*;
public class RelativeRanks {
    public static void main(String[] args) {
        int score[] = {10,3,8,9,4};
        System.out.println(Arrays.toString(ranking(score)));
    }
    public static String[] ranking(int score[]){
        String[] answers=new String[score.length];
        // List<Integer> list = Arrays.asList(score);
        List<Integer> list = new ArrayList<>();
        for (int s : score) {
              list.add(s);
                }
        Collections.sort(list,Collections.reverseOrder());
        Map<Integer,String> map = new HashMap<>();
        for(int i = 0; i < list.size();i++){
            if(i==0){
                map.put(list.get(i),"Gold Medal");
            }else if(i==1){
                map.put(list.get(i),"Silver Medal");
            }else if(i==2){
                map.put(list.get(i),"Bronze Medal");
            }else{
                map.put(list.get(i),Integer.toString(i+1));
            }
        }
        for(int i = 0 ; i < score.length;i++){
            answers[i] = map.get(score[i]);
        }
        return answers;
    }
}   
