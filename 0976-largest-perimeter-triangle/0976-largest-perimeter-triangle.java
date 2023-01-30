class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxperi=0;
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2]){
            maxperi=Math.max(maxperi,nums[i]+nums[i+1]+nums[i+2]);
                }
        }
        return maxperi;
    }
}