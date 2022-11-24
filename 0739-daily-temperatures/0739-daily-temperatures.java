class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                temperatures[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            temperatures[st.pop()]=0;
        }
        return temperatures;
    }
}