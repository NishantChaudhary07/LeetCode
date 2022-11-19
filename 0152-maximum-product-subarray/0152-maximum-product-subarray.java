class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            
            int max=maxprod;
        maxprod=Math.max(nums[i], Math.max(minprod*nums[i],nums[i]*maxprod));
        minprod=Math.min(nums[i],Math.min(minprod*nums[i],nums[i]*max));
                         
        ans=Math.max(ans,maxprod);
        }
        return ans;
    }
                              
}
            
           
        