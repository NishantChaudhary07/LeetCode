class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max=0,res=0;;
        for(int key:map.keySet()){
            if(map.get(key)>majority){
                res=key;
            }
        }
        return res;
    }
}