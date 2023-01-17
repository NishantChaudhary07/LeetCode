class Solution {
    public String toGoatLatin(String sentence) {
        String[] strarr=sentence.split(" ");
        String ma="maa";
        String res="";
        for(int i=0;i<strarr.length;i++){
            char ch=strarr[i].toLowerCase().charAt(0);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                res+=strarr[i]+ma+" ";
            }
            else{
                String word="";
                word=word+strarr[i].substring(1)+strarr[i].charAt(0)+ma;
                res+=word+" ";
            }
            ma+='a';
        }
        return res.trim();
    }
}