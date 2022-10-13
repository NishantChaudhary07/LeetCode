class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        int start=1;
        int end=x/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            int target=x/mid;
            if(mid==target)
                return mid;
            else if(target>mid)
                start=mid+1;
            else
                end=mid-1;
        }
        return end;
    }
}