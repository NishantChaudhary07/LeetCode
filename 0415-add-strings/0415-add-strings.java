class Solution {
    public String addStrings(String num1, String num2) {
         int len1=num1.length()-1;
         int len2=num2.length()-1;
       
        String res="";
        int carry=0;
        while(len1>=0 || len2>=0){
            int sum=0;
            if(len1>=0){
                int n1=num1.charAt(len1)-'0';
                sum+=n1;
                len1--;
            }
            if(len2>=0){
                int n2=num2.charAt(len2)-'0';
                sum+=n2;
                len2--;
            }
            
            int sum1=(sum+carry)%10;
            carry=(sum+carry)/10;
            res=sum1+res;
            }
      
        if(carry>0)
            res=carry+res;
        return res;
    }
}