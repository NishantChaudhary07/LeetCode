class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int start=0,end=s.length()-1;
        char[] ch=s.toCharArray();
        while(start<end){
            while(start<ch.length && !vowels.contains(ch[start])){
                start++;
            }
             while(end>=0 && !vowels.contains(ch[end])){
                end--;
            }
            if(start>end) 
                break;
            
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            
            if(vowels.contains(ch[start]) &&vowels.contains(ch[end])){
            start++;
            end--;
            }
        }
        String res="";
        for(int i=0;i<ch.length;i++){
            res+=ch[i];
        }
        return res;
    }
}