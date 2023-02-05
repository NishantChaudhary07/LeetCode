class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> s0=new Stack<>();
      Stack<Character> t0=new Stack<>();
        int i=0;
        while(i<s.length()){
            
            if(s.charAt(i)=='#'){
               if(!s0.isEmpty())
                   s0.pop();
            }
            else{
                s0.push(s.charAt(i));
            }
            i++;
        }
        i=0;
            while(i<t.length()){
            
            if(t.charAt(i)=='#'){
               if(!t0.isEmpty())
                   t0.pop();
            }
            else{
                t0.push(t.charAt(i));
            }
                i++;
        }
        if(s0.size()!=t0.size()){
            return false;
        }
        while(!s0.isEmpty()){
            if(s0.pop()!=t0.pop()){
                return false;
            }
        }
        return true;
    }
}