class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int temp=1;
        for(int i=0;i<len;i++){
            res[i]=temp;
            temp*=nums[i];
        }
        
        temp=1;
        for(int i=len-1;i>=0;i--){
            res[i]*=temp;
            temp*=nums[i];
        }
        return res;
    }
}