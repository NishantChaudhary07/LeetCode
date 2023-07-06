class Solution {
    public static void solution(int[] nums,int idx,List<Integer> lst,List<List<Integer>> res){
        if(idx==nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        solution(nums,idx+1,lst,res);
        lst.add(nums[idx]);
        solution(nums,idx+1,lst,res);
        lst.remove(lst.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        solution(nums,0,lst,res);
        return res;
    }
}