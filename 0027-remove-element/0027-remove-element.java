class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[end]==val){
                end--;
            }
            else if(nums[start]==val && end>=0){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            else{
                start++;
            }
        }
        return end+1;
    }
}