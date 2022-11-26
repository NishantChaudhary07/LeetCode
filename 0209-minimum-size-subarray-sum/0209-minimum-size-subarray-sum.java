class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int start=0;
        int min_size=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min_size=Math.min(min_size,i-start+1);
                sum-=nums[start++];
            }
        }
        return (min_size==Integer.MAX_VALUE)?0:min_size;
    }
}