public class TrappingRainwater {
    public static void main(String[] args) {
        int heights[]={4, 2, 0, 3, 2, 5};
        // int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapWater(heights));
    }
    public static int  trapWater(int heights[]){
        int n =heights.length;
        // left max array 
        int leftmax[]=new int[n];
        leftmax[0]=heights[0];
        for(int i = 1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],heights[i]);
        }
        // rightmax array
        int rightmax[]=new int[n];
        rightmax[n-1]=heights[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],heights[i]);
        }
        // calculate water 
        int water = 0 ;
        for(int i = 0 ; i < n;i++){
            water+= Math.min(leftmax[i],rightmax[i])-heights[i];
        }
        return water;
    }
}
