class Solution {
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
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[ind][j]==target){
               ans=true;
			}
		}
		}
		return ans;
    }
}
