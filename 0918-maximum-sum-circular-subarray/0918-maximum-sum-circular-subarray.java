class Solution {
    public static int KadaneAlgo(int[] nums){
        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currsum<0){
                currsum=nums[i];
            }
            else{
               currsum+=nums[i];
            }
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int Kadan1=KadaneAlgo(nums);
        int sum=0;
        int res=Kadan1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=-nums[i];
        }
        if(Kadan1>0){
            res=Math.max(Kadan1,sum+KadaneAlgo(nums));
        }
        return res;
        
    }
}