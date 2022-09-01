/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0;
        int end=n;
        int mid=((end-start))/2+start;
        int res=0;
        while(start<=end){
        if(isBadVersion(mid)==true){
            res=mid;
            end=mid-1;
        }
        else {
            start=mid+1;
        }
         mid=((end-start))/2+start;   
        }
        return res;
    }
}