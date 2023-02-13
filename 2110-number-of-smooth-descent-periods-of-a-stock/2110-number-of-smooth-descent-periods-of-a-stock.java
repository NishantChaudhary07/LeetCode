class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=1;
        int start=0,end=1;
        while(end<prices.length){
           
            if(prices[end-1]-prices[end]!=1){
                start=end;
            }
             ans+=end-start+1;
            end++;
        }
        return ans;
    }
}