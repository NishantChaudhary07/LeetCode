class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(!map.containsKey(currsum%k)){
                map.put(currsum%k,i+1);
            }
            else if(map.get(currsum%k)<i){
                return true;
            }
        }
        return false;
    }
}