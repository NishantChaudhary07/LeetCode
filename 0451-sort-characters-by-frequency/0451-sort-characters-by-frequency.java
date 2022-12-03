class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            }
            else{
                freq.put(ch,freq.get(ch)+1);
            }
        }
        List<Integer> lst=new ArrayList<>();
        for(char key:freq.keySet()){
            lst.add(freq.get(key));
        }
        Collections.sort(lst);
        String ans="";
        for(int i=lst.size()-1;i>=0;i--){
            for(char key:freq.keySet()){
                if(lst.get(i)==freq.get(key)){
                    int k=lst.get(i);
                    while(k>0){
                        ans+=key;
                        freq.put(key,0);
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}