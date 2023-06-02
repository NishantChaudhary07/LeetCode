class Solution {
    public static boolean binarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
		int ind=matrix.length-1;
		for(int i=0;i<matrix.length-1;i++){
			if(target==matrix[i][0]){
				ans=true;
				break;
			}
           else if(target>matrix[i][0] && target<matrix[i+1][0]){
			   ind=i;
			   break;
		   }
		}
		if(ans!=true){
		// for(int j=0;j<matrix[0].length;j++){
		// 	if(matrix[ind][j]==target){
		// ans=true;
		// 	}
		// }
            ans=binarySearch(matrix[ind],0,matrix[ind].length-1,target);
		}
		return ans;
    }
}
