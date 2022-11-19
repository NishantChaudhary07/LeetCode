class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<min){
                min=nums[mid];
            }
           
            
            if(nums[end]<nums[mid]){
                start=mid+1;
            }
            else if(nums[end]>nums[mid]){
                end=mid;
            }
            else
                end--;
        }
        return min;
    }
}