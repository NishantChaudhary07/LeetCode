class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int suffsum=0,satisfactionsum=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            suffsum+=satisfaction[i];
            if(suffsum<0){
                return satisfactionsum;
            }
            satisfactionsum+=suffsum;
        }
        return satisfactionsum;
    }
}