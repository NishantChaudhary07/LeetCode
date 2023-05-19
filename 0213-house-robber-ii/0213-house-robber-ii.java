class Solution {
    private int robDP(int[] nums,int i,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=nums[i]+robDP(nums,i+2,n,dp);
        int not_rob=robDP(nums,i+1,n,dp);
        return dp[i]=Math.max(rob,not_rob);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int first_rob=robDP(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int first_not_rob=robDP(nums,1,n,dp);
        return Math.max(first_rob,first_not_rob);
    }
}