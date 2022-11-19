class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxcount=0;
        int flipzero=0;
        int start=0;
        int end=0;
        while(end<nums.length){
            if(nums[end]==0){
                flipzero++;        
            }
            
            if(flipzero>k){
              while(flipzero>k && start<nums.length){
                if(nums[start]==0){
                    flipzero--;
                }
                start++;
             } 

            }  
            
            maxcount=Math.max(maxcount,end-start+1);
            
            end++;
        }
        return maxcount;
    }
}