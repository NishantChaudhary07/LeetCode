class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] leftmax=new int[len];
        int[] rightmax=new int[len];
        leftmax[0]=height[0];
        for(int i=1;i<len;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[len-1]=height[len-1];
         for(int i=len-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        
        int totalwater=0;
        for(int i=0;i<len;i++){
            totalwater+=Math.min(rightmax[i],leftmax[i])-height[i];
        }
        return totalwater;
    }
}