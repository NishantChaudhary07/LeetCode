class Solution {
    public long getDescentPeriods(int[] prices) {
        Stack<Integer> st=new Stack<>();
        long ans=0;
        for(int i=0;i<prices.length;i++){
                ans+=st.size();
            if(!st.isEmpty() && st.peek()-prices[i]!=1){
               st.clear();
            }
          st.push(prices[i]);  
        }

            ans+=st.size();
        return ans;
    }
}