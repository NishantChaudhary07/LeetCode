class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==')'){
                if(st.pop()!='('){
                    return false;
                }
            }
            else if(!st.isEmpty() && ch=='}'){
                if(st.pop()!='{'){
                    return false;
                }
            }
            else if(!st.isEmpty() && ch==']'){
                if(st.pop()!='['){
                    return false;
                }
            }
            else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}