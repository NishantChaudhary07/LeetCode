class Solution {
    public int maxProduct(int[] nums) {
        int suffix=1,prefix=1,max=nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(suffix==0){
                suffix=1;
            }
            if(prefix==0){
                prefix=1;
            }
            
            suffix*=nums[i];
            prefix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(suffix,prefix));
        }
        return max;
    }
}