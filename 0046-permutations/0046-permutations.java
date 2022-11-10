class Solution {
    public static void permutations(List<Integer> inp,List<Integer> out,List<List<Integer>> res){
        if(inp.size()==0){
            res.add(new ArrayList<Integer>(out));
            // out.clear();
            return;
        }
        for(int i=0;i<inp.size();i++){
            out.add(inp.get(i));
            int n=inp.remove(i);
            // List<Integer> newinp=new ArrayList<Integer>(inp);
            permutations(inp,out,res);
            inp.add(i,n);
            out.remove(out.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inp=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            inp.add(nums[i]);
        }
        permutations(inp,new ArrayList<>(),res);
        return res;
    }
}