class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        title+=" ";
        String res="";
        String word="";
        for(int i=0;i<title.length();i++){
            char ch=title.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else{
                if(word.length()<=2){
                    res+=word;
                }
                else{
                    String word1=(word.substring(0,1)).toUpperCase()+word.substring(1);
                    res+=word1;
                }
                res+=" ";
                word="";
            }
        }
        return res.trim();
    }
}