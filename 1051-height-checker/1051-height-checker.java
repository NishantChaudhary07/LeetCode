class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
      int[] freq=new int[101];
        for(int ele:heights){
            freq[ele]++;
        }
        int j=0;
        for(int i=0;i<101;i++){
            while(freq[i]!=0){
                if(i!=heights[j]){
                    count++;
                }
                j++;
                freq[i]--;
            }
        }
        return count;
    }
}