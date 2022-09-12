class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int len1=num1.length();
        int len2=num2.length();
        int[] res=new int[len1+len2];
        int k=0;
        int pos=0;
        int carry=0;
        for(int i=len1-1;i>=0;i--){
            k=len1+len2-1-pos;
            pos++;
            int ch1=num1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int ch2=num2.charAt(j)-'0';
                int multi=ch1*ch2+carry+res[k];
                res[k]=multi%10;
                k--;
                carry=multi/10;
            }
            if(carry>0){
                res[k]=carry;
                carry=0;
            }
        }
        int a=0;
        while(res[a]==0){
            a++;
        }
        String st="";
        for(int i=a;i<len1+len2;i++)
            st+=res[i];
        return st;
    }
}