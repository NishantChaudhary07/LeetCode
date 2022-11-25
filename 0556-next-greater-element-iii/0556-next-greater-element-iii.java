class Solution {
    
    public static void reverse(char[] arr,int ind){
        int start=ind+1;
        int end=arr.length-1;
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public int nextGreaterElement(int n) {
        String str=String.valueOf(n);
        char[] arr=str.toCharArray();
        
        int ind=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                // System.out.println(ind);
                break;
            }
        }
        String ans="";
        if(ind==-1){
            return -1;
            // reverse(arr,0);
        }
        else{
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>arr[ind]){
                    char temp=arr[i];
                    arr[i]=arr[ind];
                    arr[ind]=temp;
                    break;
                }
            }
            reverse(arr,ind);
            for(char ele:arr){
            ans+=ele;
        }
        }
        
        try{
         int res= Integer.parseInt(ans);
            return res;
        }
        catch(Exception e){
            return -1;
        }
    }
}