class Solution {
    public char repeatedCharacter(String s) {
        List<Character> lst=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!lst.contains(ch)){
                lst.add(ch);
            }
            else{
                return ch;
            }
        }
        return '*';
    }
}