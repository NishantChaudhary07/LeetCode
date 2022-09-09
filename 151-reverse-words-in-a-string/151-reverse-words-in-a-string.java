class Solution {
    public String reverseWords(String s) {
          s=s.trim();
        String[] st=s.split("\\s+");
        String resst="";
        for(int i=st.length-1;i>=0;i--){
            resst+=st[i]+" ";
        }
        return resst.trim();
    }
}