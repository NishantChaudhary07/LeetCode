class Solution {
    
    public static void inverseArray(int[] arr,int l,int hi){
		while(l<=hi){
			int temp=arr[l];
			arr[l]=arr[hi];
			arr[hi]=temp;
			l++;
			hi--;
		}
	}
    public void nextPermutation(int[] arr) {
        int len=arr.length;
         int ind=-1;
		for(int i=len-2;i>=0;i--){
			if(arr[i+1]>arr[i]){
				ind=i;
				break;
			}
		}
		if(ind==-1){
            inverseArray(arr,0,len-1);
		}

		else{
		
		for(int i=len-1;i>=0;i--){
			if(arr[i]>arr[ind]){
				int temp=arr[i];
				arr[i]=arr[ind];
				arr[ind]=temp;
				break;
			}
		}
		inverseArray(arr,ind+1,len-1);
		}
		
		
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
    }
}