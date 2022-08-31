class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        leftmax[0]=height[0];
        int totalwater=0;
        for(int i=1;i<height.length;i++){
           leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[height.length-1]=height[height.length-1];
          for(int i=height.length-2;i>=0;i--){
           rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        for(int i=0;i<height.length;i++){
            totalwater=totalwater+Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return totalwater;
    }
}