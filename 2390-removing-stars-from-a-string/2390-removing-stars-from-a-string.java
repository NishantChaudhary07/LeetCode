class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }
}