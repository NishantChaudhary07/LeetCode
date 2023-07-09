class Solution {
    public static void permute(int[] nums,List<Integer> lst,List<List<Integer>> res,boolean[] vis){
        if(lst.size()==nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(vis[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !vis[i-1]){
                continue;
            }
            lst.add(nums[i]);
            vis[i]=true;
            permute(nums,lst,res,vis);
            vis[i]=false;
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        Arrays.sort(nums);
        permute(nums,lst,res,vis);
        return res;
    }
}