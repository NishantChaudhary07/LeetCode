class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        List<Character> lst=new ArrayList<>();
        lst.add('b');
        lst.add('a');
        lst.add('l');
        lst.add('o');
        lst.add('n');
        for(char c:text.toCharArray()){
            if(lst.contains(c)){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
            }
        }
        if(map.size()<5){
            ans=0;
        }
        else{
        for(char key:map.keySet()){
            if(key=='l' || key=='o'){
               ans=Math.min(ans,map.get(key)/2);
            }
            else{
                 ans=Math.min(ans,map.get(key));
            }
        }
        }
        return ans;
    }
}