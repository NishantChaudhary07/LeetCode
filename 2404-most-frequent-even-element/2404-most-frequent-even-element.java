class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && !map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int max=0,res=-1;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                res=key;
            }
            if(map.get(key)==max && key<res){
                res=key;
            }
        }
        return res;
    }
}