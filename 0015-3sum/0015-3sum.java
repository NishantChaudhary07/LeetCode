class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1,r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[r]+nums[l]==0){
                    List<Integer> lst=new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[l]);
                    lst.add(nums[r]);
                    res.add(new ArrayList<>(lst));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                 
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}