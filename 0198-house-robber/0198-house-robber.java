class Solution {
    public int RobDP(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int rob=nums[i]+RobDP(nums,i+2,dp);
        int dont_rob=RobDP(nums,i+1,dp);
        return dp[i]=Math.max(rob,dont_rob);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return RobDP(nums,0,dp);
    }
}