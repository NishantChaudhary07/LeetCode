class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
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
                lst.add(i+1);
            }
        }
        return lst;
    }
}