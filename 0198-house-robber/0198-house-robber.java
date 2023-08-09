class Solution {
    public int maxAmt(int[] nums,int idx,int[] dp){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int rob=nums[idx]+maxAmt(nums,idx+2,dp);
        int dontRob=maxAmt(nums,idx+1,dp);
        return dp[idx]=Math.max(rob,dontRob);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return maxAmt(nums,0,dp);
    }
}