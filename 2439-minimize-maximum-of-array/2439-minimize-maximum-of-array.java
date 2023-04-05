class Solution {
    public int minimizeArrayValue(int[] nums) {
       long ans=0,prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            ans=Math.max(ans,(long)Math.ceil((prefixsum)/(i+1.0)));
        }
        return (int)ans;
    }
}