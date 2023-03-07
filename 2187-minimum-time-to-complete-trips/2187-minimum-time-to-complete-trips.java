class Solution {
    private boolean isPossible(int[] time,long mid,int totalTrips){
        long currtrip=0;
        for(int i=0;i<time.length;i++){
            currtrip=currtrip+mid/time[i];
            if(currtrip>=totalTrips){
            return true;
        }
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long end=Long.MAX_VALUE;
        for(int i=0;i<time.length;i++){
            end=Math.min(end,time[i]);
        }
        long start=1;
        end=end*totalTrips;
        long ans=0;
        while(start<=end){
            long mid=(start+end)/2;
            if(isPossible(time,mid,totalTrips)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}