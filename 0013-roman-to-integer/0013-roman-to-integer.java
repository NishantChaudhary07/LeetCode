class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char prev_ch=s.charAt(i-1);
            int ch_val=map.get(ch);
            int prev_ch_val=map.get(prev_ch);
            if(prev_ch_val<ch_val){
                num-=prev_ch_val;
            }
            else{
                num+=prev_ch_val;
            }
        }
        num+=map.get(s.charAt(s.length()-1));
        return num;
    }
}