class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shift=new int[s.length()+1];
        for(int[] arr:shifts){
            int val=arr[2]==1?1:-1;
            shift[arr[0]]+=val;
            shift[arr[1]+1]-=val;
        }

        String ans="";
        int prefix=0;
        for(int i=0;i<s.length();i++){
           prefix+=shift[i];
            int ascii=s.charAt(i)-'a'+prefix;
            ascii%=26;
            if(ascii<0){
                ascii+=26;
            }
            ans+=(char)('a'+ascii);
        }
        return ans;
    }
}