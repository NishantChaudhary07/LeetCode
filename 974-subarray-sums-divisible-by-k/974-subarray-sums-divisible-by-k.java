class Solution {

    public int subarraysDivByK(int[] arr, int k) {
        int len=arr.length;
			int[] rem=new int[k];
			rem[0]=1;
			int sum=0;
			for(int i=0;i<len;i++){
             sum+=arr[i];
			 if(sum%k<0){
				 rem[sum%k+k]++;
			 }
			 else{
			 rem[sum%k]++;
			 }
			}
			int count=0;
			for(int i=0;i<k;i++){
				
                if(rem[i]>=2){
					count=count+(rem[i]*(rem[i]-1))/2;
				}
			}
        return count;
    }
}