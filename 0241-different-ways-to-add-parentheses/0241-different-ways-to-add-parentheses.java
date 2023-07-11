class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='-' || ch=='+' || ch=='*'){
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
                List<Integer> left_lst=diffWaysToCompute(left);
                List<Integer> right_lst=diffWaysToCompute(right);
                for(int x:left_lst){
                    for(int y:right_lst){
                        if(ch=='-'){
                            res.add(x-y);
                        }
                        else if(ch=='+'){
                            res.add(x+y);
                        }
                        else if(ch=='*'){
                            res.add(x*y);
                        }
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}