class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            int asci=(int)s.charAt(i);
            if(asci>=65 && asci<=90){
                res+=(char)(asci+32);
            }
            else{
                res+=s.charAt(i);
            }
        }
        return res;
    }
}