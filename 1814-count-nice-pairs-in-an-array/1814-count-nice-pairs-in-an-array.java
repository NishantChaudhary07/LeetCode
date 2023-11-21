class Solution {
 public int rev(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
     return result;
 }
    public int countNicePairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-rev(nums[i]);
            if(!map.containsKey(diff)){
                map.put(diff,1);
            }
            else{
                count=count+map.get(diff);
                count=count%(int)(1e9+7);
                map.put(diff,map.get(diff)+1);
            }
        }
        return count;
    }
}