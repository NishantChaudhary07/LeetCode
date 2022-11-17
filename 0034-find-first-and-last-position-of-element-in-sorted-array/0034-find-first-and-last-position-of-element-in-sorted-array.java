class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int start=0,end=nums.length-1;
        res[0]=-1;
        res[1]=-1;
        if(nums.length==0){
            return res;
        }
        int pos=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                pos=mid;
                break;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(pos);
        int initial=pos;
        int finalpos=pos;
        if(pos!=-1){
        while(initial>1 && nums[initial-1]==nums[initial]){
            --initial;
        }
        if(initial>0 && nums[initial-1]==nums[initial]){
            initial--;
       }
        while(finalpos<nums.length-1 && nums[finalpos+1]==nums[finalpos]){
            ++finalpos;
        }
            if(finalpos==nums.length-2 && nums[finalpos+1]==nums[finalpos]){
                finalpos++;
            }
             res[0]=initial;
           res[1]=finalpos;
        }
       
        
        return res;
    }
}