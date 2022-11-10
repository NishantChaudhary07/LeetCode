class Solution {
    public static void shift(int[] arr,int idx){
        for(int i=arr.length-1;i>idx;i--){
            arr[i]=arr[i-1];
        }
    }
    public void duplicateZeros(int[] arr) {
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0){
                i++;
                shift(arr,i);
                arr[i]=0;
                i++;
            }
            else{
                i++;
            }
        }
    }
}