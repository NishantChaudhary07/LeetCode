class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        boolean first=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==false){
                    res[0]=i;
                    first=true;
                }
                res[1]=i;
            }
            if(first==true && nums[i]!=target){
                break;
            }
        }
        return res;
    }
}