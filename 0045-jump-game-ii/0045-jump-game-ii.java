class Solution {
    public int jump(int[] nums) {
        int ans=0,far=0,end=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==end){
                end=far;
                ans++;
            }
        }
        return ans;
    }
}