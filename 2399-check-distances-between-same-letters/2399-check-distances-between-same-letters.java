class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            else{
                map.put(s.charAt(i),i-map.get(s.charAt(i))-1);
            }
        }
       for(char key:map.keySet()){
           if(distance[(int)key-97]!=map.get(key))
               return false;
       }
        return true;
    }
}