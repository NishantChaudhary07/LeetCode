class Solution {
    public int robberDP(int[] arr,int i,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+robberDP(arr,i+2,dp);
        int dontrob=robberDP(arr,i+1,dp);
        return dp[i]=Math.max(rob,dontrob);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robberDP(nums,0,dp);
    }
}