class Solution {
    public boolean containsDuplicate(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
          if(!map.containsKey(nums[i])){
              map.put(nums[i],1);
          }
          else{
              return true;
          }
      }
      return false;
    }
}