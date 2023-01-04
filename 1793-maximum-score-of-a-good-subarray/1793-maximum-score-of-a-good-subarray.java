class Solution {
  
    public int maximumScore(int[] nums, int k) {
           Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                int h=nums[st.pop()];
                int r=i;
                if(r-1>=k){
                if(!st.isEmpty()){
                    int l=st.peek();
                    if(l+1<=k){
                    ans=Math.max(ans,(r-l-1)*h);
                    }
                    }
                else{
                    ans=Math.max(ans,r*h);
                }
            }
            }
            st.push(i);
        }
        int r=nums.length;
        while(!st.isEmpty() && r-1>=k){
            int h=nums[st.pop()];
            if(!st.isEmpty()){
                int l=st.peek();
                if(l+1<=k){
                ans=Math.max(ans,h*(r-l-1));
                }
            }
            else{
                ans=Math.max(ans,h*r);
            }
        }
        return ans;  
    }
}