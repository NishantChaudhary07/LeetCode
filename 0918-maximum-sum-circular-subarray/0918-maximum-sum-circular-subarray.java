class Solution {
    	public static int kadanAlgo(int[] arr){
		int currsum=arr[0];
		int maxsum=arr[0];
		for(int i=1;i<arr.length;i++){
			if(currsum<0){
				currsum=arr[i];
			}
			else{
				currsum+=arr[i];
			}
			if(currsum>maxsum){
				maxsum=currsum;
			}
		}
		return maxsum;
	}
    public int maxSubarraySumCircular(int[] nums) {
        int len=nums.length;
        int kadansum1=kadanAlgo(nums);
		int arrsum=0;
		int ressum=0;
		for(int i=0;i<len;i++){
			arrsum+=nums[i];
			nums[i]=-nums[i];
		}	
		if(kadansum1<0){
           ressum=kadansum1;
		}

		else{
			int kadansum2=kadanAlgo(nums);
			ressum=Math.max(kadansum1,arrsum+kadansum2);
		}
       return ressum;
	}  
    }
