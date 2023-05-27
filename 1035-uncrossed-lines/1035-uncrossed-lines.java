class Solution {
    private int TopDownDP(int[] num1,int[] num2,int i,int j,int[][] dp){
        if(i==num1.length || j==num2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int count=0;
        if(num1[i]==num2[j]){
            count=1+TopDownDP(num1,num2,i+1,j+1,dp);
        }
        else{
            int ig_first=TopDownDP(num1,num2,i+1,j,dp);
            int ig_sec=TopDownDP(num1,num2,i,j+1,dp);
            count=Math.max(ig_first,ig_sec);
        }
        return dp[i][j]=count;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        return TopDownDP(nums1,nums2,0,0,dp);
    }
}