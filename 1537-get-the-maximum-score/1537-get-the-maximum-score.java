class Solution {
    public int maxSum(int[] arr1, int[] arr2) {
        int len1=arr1.length;
        int len2=arr2.length;
        long totalsum=0;
		long sum1=0;
		long sum2=0;
		int i=0;
		int j=0;
		while(true){
			if(i==len1 || j==len2)
			break;
            
			if(arr1[i]<arr2[j]){
				sum1+=arr1[i];
			    i++;
			}
			else if(arr1[i]>arr2[j]){
				sum2+=arr2[j];
			   j++;
			}
			else if(arr1[i]==arr2[j]){
				sum1+=arr1[i];
				sum2+=arr2[j];
				if(sum1>sum2){
					totalsum+=sum1;
				}
				else{
					totalsum+=sum2;
				}
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
		}
		while(i!=len1){
			sum1+=arr1[i];
			i++;
		}

		while(j!=len2){
			sum2+=arr2[j];
			j++;
		}

		if(sum1>sum2){
					totalsum+=sum1;
				}
				else{
					totalsum+=sum2;
				}
	    return (int)(totalsum%((int)Math.pow(10,9)+7));
	}
 }
