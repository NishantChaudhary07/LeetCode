class Solution {
    public int helper(int[] nums1,int[] nums2,int i,int j,int[][] dp){
        if(i==nums1.length || j==nums2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ig_b=0;
        if(nums1[i]==nums2[j]){
            ig_b=1+helper(nums1,nums2,i+1,j+1,dp);
        }
        int ig_f=helper(nums1,nums2,i+1,j,dp);
        int ig_s=helper(nums1,nums2,i,j+1,dp);
        return dp[i][j]=Math.max(ig_b,Math.max(ig_f,ig_s));
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(nums1,nums2,0,0,dp);
    }
}