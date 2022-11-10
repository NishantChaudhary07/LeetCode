class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        for(char i='a';i<='z';i++){
            boolean flag0=true;
            int mincount=Integer.MAX_VALUE;
            for(String st:words){
                int count=0;
             for(int j=0;j<st.length();j++){
                 if(i==st.charAt(j)){
                     count++;
                 }
             }
             mincount=Math.min(mincount,count);
             if(count==0){
                 flag0=false;
                 break;
             }
            }
            if(flag0==true){
                while(mincount>0){
                res.add(Character.toString(i));
                mincount--;
                }
            }
        }
        return res;
    }
}