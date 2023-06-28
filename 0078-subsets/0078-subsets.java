class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int num=0;num<(1<<nums.length);num++){
            for(int digit=0;digit<nums.length;digit++){
                if(((1<<digit) & num)!=0){
                    lst.add(nums[digit]);
                }
            }
            res.add(new ArrayList<>(lst));
            lst=new ArrayList<>();
        }
        return res;
    }
}