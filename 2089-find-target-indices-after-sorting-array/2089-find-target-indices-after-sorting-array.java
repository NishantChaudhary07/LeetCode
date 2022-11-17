class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lst=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                break;
            }
            if(nums[i]==target){
                lst.add(i);
            }
        }
        return lst;
    }
}