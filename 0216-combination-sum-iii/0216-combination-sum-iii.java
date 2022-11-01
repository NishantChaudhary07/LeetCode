class Solution {
    public static void combination(int k,int n,List<Integer> list,List<List<Integer>> res,int idx){
        if(list.size()==k && n==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=idx;i<=9;i++){
            if(n>=i){
                list.add(i);
                combination(k,n-i,list,res,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combination(k,n,list,res,1);
        return res;
    }
}