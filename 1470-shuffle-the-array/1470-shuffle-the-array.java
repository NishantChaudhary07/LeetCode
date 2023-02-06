class Solution {
    public int[] shuffle(int[] nums, int n) {
     int[] res=new int[2*n];
        int i=0,j=n;
        while(i<n){
            res[2*i]=nums[i];
            res[2*i+1]=nums[j];
            j++;
            i++;
        }
      
        return res;
    }
}