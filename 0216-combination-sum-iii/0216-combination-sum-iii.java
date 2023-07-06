class Solution {
    public static void combination(int k,int currsum,int target,int idx,List<Integer> lst,List<List<Integer>> res){
        if(lst.size()>k){
            return;
        }
        if(currsum==target && lst.size()==k){
            res.add(new ArrayList<>(lst));
        }
        for(int i=idx;i<=9;i++){
            lst.add(i);
            combination(k,currsum+i,target,i+1,lst,res);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        combination(k,0,n,1,lst,res);
        return res;
    }
}