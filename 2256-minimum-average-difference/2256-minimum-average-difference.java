class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        long sum1=nums[0];
        long sum2=0;
        for(int i=1;i<nums.length;i++){
            sum2+=nums[i];
        }
        long mindiff=Integer.MAX_VALUE;;
        int ind=0;
        mindiff=Math.min(mindiff,Math.abs(sum1-sum2/(nums.length-1)));
        for(int i=1;i<nums.length-1;i++){
            sum1+=nums[i];
            sum2-=nums[i];
            long currdiff=Math.abs(sum1/(i+1)-sum2/(nums.length-i-1));
            
            if(currdiff<mindiff){
                mindiff=currdiff;
                ind=i;
                // System.out.println(ind);
            }
        }
        if((sum1+nums[nums.length-1])/nums.length<mindiff){
            return nums.length-1;
        }
        return ind;
    }
}