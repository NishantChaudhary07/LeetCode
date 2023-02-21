class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1,ans=nums[0];
        
        while(start<=end){
            int mid=(start+end)/2;
            if((mid<nums.length-1 && mid%2==0 && nums[mid]==nums[mid+1] ) || mid%2==1 && (nums[mid]==nums[mid-1] )){
                start=mid+1;
            }
            else{
                ans=nums[mid];end=mid-1;
            }
        }
        return ans;
    }
}