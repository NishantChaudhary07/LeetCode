class Solution {
    public static void backtrack(int[] nums,List<Integer> lst,List<List<Integer>> res,boolean[] vis){
        if(lst.size()==nums.length){
            res.add(new ArrayList<>(lst)); 
            return;
        }
        
            for(int i=0;i<nums.length;i++){
                if(vis[i]){
                    continue;
                }
                if(i>0 && nums[i-1]==nums[i] && !vis[i-1]){
                    continue;
                }
                
                vis[i]=true;
                lst.add(nums[i]);
                backtrack(nums,lst,res,vis);
                vis[i]=false;
                lst.remove(lst.size()-1);
                
            }
        }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,lst,res,vis);
        return res;
    }
}