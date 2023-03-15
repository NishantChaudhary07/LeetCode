class Solution {
    public int minPatches(int[] nums, int n) {
        long missing=1;
        int patchcount=0;
        int i=0;
        while(missing<=n){
            if(i<nums.length && missing>=nums[i]){
                missing+=nums[i];
                i++;
            }
            else{
                patchcount++;
                missing+=missing;
            }
        }
        return patchcount;
    }
}