class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> lst=new ArrayList<>();
        for(int key:map.keySet()){
            lst.add(map.get(key));
        }
        
        int[] res=new int[k];
        Collections.sort(lst);
        int i=lst.size()-1;
        while(k>0){
          for(int key:map.keySet()){
              if(map.get(key)==lst.get(i)){
                  res[res.length-k]=key;
                  map.remove(key);
                  break;
              }
          } 
            k--;
            i--;
        }
        return res;
    }
}