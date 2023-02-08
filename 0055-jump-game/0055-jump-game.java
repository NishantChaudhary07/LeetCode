class Solution {
    public boolean canJump(int[] nums) {
        int end=0;
        for(int i=0;i<=end;i++){
            end=Math.max(end,i+nums[i]);
            if(end>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}