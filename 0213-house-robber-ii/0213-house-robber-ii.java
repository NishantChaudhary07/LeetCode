class Solution {
    public int maxRob(int[] nums,int idx,int n,int[] dp){
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int rob=nums[idx]+maxRob(nums,idx+2,n,dp);
        int dontRob=maxRob(nums,idx+1,n,dp);
        return dp[idx]=Math.max(rob,dontRob);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int first=maxRob(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int sec=maxRob(nums,1,n,dp);
        return Math.max(first,sec);
        
    }
}