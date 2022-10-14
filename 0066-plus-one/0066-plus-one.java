class Solution {
    public int[] plusOne(int[] digits) {
    int len=digits.length;
        boolean flag=true;
        for(int i=0;i<len;i++){
            if(digits[i]!=9){
                flag=false;
                break;
            }
        }
        int newlen=len;
        if(flag){
          newlen+=1;
        }
       int[] arr=new int[newlen];
        
        int sum=(digits[len-1]+1)%10;
        arr[newlen-1]=sum;
        int carry=(digits[len-1]+1)/10;
        for(int i=len-2;i>=0;i--){
            sum=(digits[i]+carry)%10;
            arr[i+newlen-len]=sum;
            carry=(digits[i]+carry)/10;
        }
        if(carry==1)
            arr[0]=carry;
        return arr;
    }
}