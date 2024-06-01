class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftprod=new int[nums.length];
        int[] rightprod=new int[nums.length];
        int[] res=new int[nums.length];
        leftprod[0]=1;
        for(int i=1;i<nums.length;i++){
            leftprod[i]=leftprod[i-1]*nums[i-1];
        }
        
        rightprod[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightprod[i]=rightprod[i+1]*nums[i+1];
        }
        
        for(int i=0;i<nums.length;i++){
            res[i]=leftprod[i]*rightprod[i];
        }
        return res;
    }
}