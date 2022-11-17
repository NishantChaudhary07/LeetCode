class Solution {
    public static int KadaneAlgo(int[] nums){
          int sum=nums[0];
        int maxsum=nums[0];
       for(int i=1;i<nums.length;i++){
           
           if(sum+nums[i]>nums[i]){
               sum+=nums[i];
           }
           else
               sum=nums[i];
    
           maxsum=Math.max(sum,maxsum);
       } 
        return maxsum;
    }
    public int maxSubArray(int[] nums) {
      int posum=KadaneAlgo(nums);
      
        return posum;
    }
}