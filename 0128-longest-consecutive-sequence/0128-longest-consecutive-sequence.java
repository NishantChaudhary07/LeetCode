class Solution {
    public int longestConsecutive(int[] nums) {
     HashMap<Integer,Boolean> map=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            map.put(nums[i],true);
        }
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        int res=0;
        for(int i=0;i<len;i++){
            if(map.get(nums[i])==true){
                int cumval=nums[i];
                int count=0;
                while(map.containsKey(cumval)){
                    count++;
                    cumval++;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
}