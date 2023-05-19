class Solution {
    private int lis(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
        return lis(nums);
    }
}