class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
           sum+=nums[i]; 
        }
        double maxsum=sum;
        for(int i=0;i<nums.length-k;i++){
            sum-=nums[i];
            sum+=nums[i+k];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum/k;
    }
}