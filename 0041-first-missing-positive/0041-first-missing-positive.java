class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int missing=n+1;
        for(int i=0;i<n;i++){
            if(nums[i]>n || nums[i]<=0){
                nums[i]=n+1;
            }
        }
         for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i]);
            if(idx>n){
                continue;
            }
             
             --idx;
             if(nums[idx]>=0){
                 nums[idx]=-nums[idx];
             }
             
        }
        for(int i=0;i<n;i++){
            
            if(nums[i]>0){
                missing=i+1;
                break;
            }
        }
        return missing;
    }
}