class Solution {
public static void parantheses(int n,int open,int close,String ans,List<String> list){
    if(open==n & close==n){
        list.add(ans);
        return;
    }
    if(open<n){
        parantheses(n,open+1,close,ans+'(',list);
    }
    if(close<open){
        parantheses(n,open,close+1,ans+')',list);
    }
}
    public List<String> generateParenthesis(int n) {
    List<String> res=new ArrayList<>();
        parantheses(n,0,0,"",res);
        return res;
    }
}