class Solution {
    public static void GenerateParanthesis(int n,int open,int close,String ans,List<String> list){
        if(open==n && close==n){
            list.add(ans);
            return;
        }
        if(open<n){
            GenerateParanthesis(n,open+1,close,ans+'(',list);
        }
        if(close<open){
           GenerateParanthesis(n,open,close+1,ans+')',list); 
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        GenerateParanthesis(n,0,0,"",list);
        return list;
    }
}