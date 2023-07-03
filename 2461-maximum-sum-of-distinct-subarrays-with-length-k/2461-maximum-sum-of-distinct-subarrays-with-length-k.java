class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int i=0,j=0;
        long sum=0,maxsum=0;
        while(j<n){
            while(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            
            if(j-i+1<k){
                j++;
            }
            else{
                maxsum=Math.max(maxsum,sum);
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return maxsum;
    }
}