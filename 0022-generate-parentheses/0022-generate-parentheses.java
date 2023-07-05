class Solution {
    public static void generate(int open,int close,int n,String ans,List<String> lst){
        
        if(open==n && close==n){
            lst.add(ans);
            return;
        }
        
        if(open<n){
            generate(open+1,close,n,ans+'(',lst);
        }
        
        if(close<open){
            generate(open,close+1,n,ans+')',lst);
        }
       
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(0,0,n,"",res);
        return res;
    }
}