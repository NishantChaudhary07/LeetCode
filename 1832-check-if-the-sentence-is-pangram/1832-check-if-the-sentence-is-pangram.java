class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a';i<='z';i++){
            boolean flag=false;
            for(int j=0;j<sentence.length();j++){
                
                if(i==sentence.charAt(j)){
                    flag=true;
                }
                
            }
            if(flag==false){
                    return flag;
                }
        }
        return true;
    }
}