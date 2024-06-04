class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(map.containsKey(st)){
                map.get(st).add(str);
            }
            else{
                map.put(st,new ArrayList<>());
                map.get(st).add(str);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String key:map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}