class Solution {
    private boolean isPossible(int[] weights,int days,int mid){
        int i=0;
        int currd=1;
        while(currd<=days){
            int currw=0;
        while(currw+weights[i]<=mid){
            currw+=weights[i];
            i++;
            if(i>=weights.length){
                return true;
            }
        }
            currd++;
        }
        return false;
        
    }
    public int shipWithinDays(int[] weights, int days) {
        int ans=0;
        int range=0;
        for(int ele:weights){
            range+=ele;
        }
        int start=1,end=range;
        while(start<=end){
            int mid=(start+end)/2;
            if(isPossible(weights,days,mid)){
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