class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{
                map.put(ele,map.get(ele)+1);
            }
        }
        List<Integer> lst=new ArrayList<>();
        for(int key:map.keySet()){
            if(lst.contains(map.get(key))){
                return false;
            }
            else{
                lst.add(map.get(key));
            }
        }
        return true;
    }
}