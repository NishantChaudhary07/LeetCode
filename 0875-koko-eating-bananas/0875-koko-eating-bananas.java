class Solution {
      private  int count(int [] nums, int speed){
        int hours = 0;
        for(int i = 0 ; i<nums.length ; i++){
            hours += Math.ceil((double)nums[i]/speed);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int end = Integer.MIN_VALUE;
        for(int i = 0 ; i<piles.length ; i++){
            end = Math.max(end,piles[i]);
        }
        int start = 1;
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            int hours = count(piles,mid);
            if(hours<=h){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
  
}