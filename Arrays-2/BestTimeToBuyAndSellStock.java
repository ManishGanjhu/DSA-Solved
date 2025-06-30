public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int prices[]={7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};

        System.out.println(profit(prices));

    }
    public static int profit(int prices[]){
        int mp = Integer.MIN_VALUE;
        int cp = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++ ){
            cp = Math.min(cp,prices[i]);
            int p = prices[i]-cp;
            mp =Math.max(mp,p);
        }
        return mp;
    }
}
