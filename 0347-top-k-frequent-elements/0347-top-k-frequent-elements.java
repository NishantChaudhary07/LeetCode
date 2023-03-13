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
       PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
      for(int key:map.keySet()){
          maxheap.add(key);
      }
      
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=maxheap.poll();
        }
        return res;
    }
}