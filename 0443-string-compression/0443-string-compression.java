class Solution {
    public int compress(char[] chars) {
        String st="";
        char ch=chars[0];
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==ch){
                count++;
            }
            else{
                if(count>1){
                    st=st+ch+count;
                }
                else{
                    st=st+ch;
                }
                ch=chars[i];
                count=1;
            }
        }
        if(count>1){
                    st=st+ch+count;
                }
                else{
                    st=st+ch;
                }
        
        for(int i=0;i<st.length();i++){
            chars[i]=st.charAt(i);
        }
        return st.length();
    }
}