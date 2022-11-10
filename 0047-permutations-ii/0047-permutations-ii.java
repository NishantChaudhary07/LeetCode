class Solution {
    public static void permutations(List<Integer> inp,List<Integer> out,List<List<Integer>> res){
        if(inp.size()==0){
           res.add(new ArrayList<Integer>(out));
           return;
        }

        for(int i=0;i<inp.size();i++){
            if(i>0 && inp.get(i)==inp.get(i-1)){
                continue;
            }
            out.add(inp.get(i));
            int n=inp.remove(i);
            permutations(inp,out,res);
            out.remove(out.size()-1);
            inp.add(i,n);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> inp=new ArrayList<>();
        Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        inp.add(nums[i]);
    }
        List<Integer> out=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        permutations(inp,out,res);
        return res;
    }
}