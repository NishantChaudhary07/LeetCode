class Solution {
    public int helper(int[] num,int idx,int previdx,int[][] dp){
        if(idx>=num.length){
            return 0;
        }
        if(dp[idx][previdx+1]!=-1){
            return dp[idx][previdx+1];
        }
        int take=0;
        if(previdx==-1 || num[idx]>num[previdx]){
            take=1+helper(num,idx+1,idx,dp);
        }
        int nottake=helper(num,idx+1,previdx,dp);
        return dp[idx][previdx+1]=Math.max(take,nottake);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(nums,0,-1,dp);
    }
}