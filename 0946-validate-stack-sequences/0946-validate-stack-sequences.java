class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int n=pushed.length;
        int i=0;
        for(int ele:pushed){
            st.push(ele);
            while(!st.isEmpty() && st.peek()==popped[i] && i<n){
                st.pop();
                i++;
            }
        }
        return i==n;
    }
}