class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] leftprod=new int[len];
        int[] rightprod=new int[len];
        leftprod[0]=1;
        for(int i=1;i<len;i++){
            leftprod[i]=leftprod[i-1]*nums[i-1];
        }
        rightprod[len-1]=1;
        for(int i=len-2;i>=0;i--){
            rightprod[i]=rightprod[i+1]*nums[i+1];
        }
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            res[i]=leftprod[i]*rightprod[i];
        }
        return res;
    }
}