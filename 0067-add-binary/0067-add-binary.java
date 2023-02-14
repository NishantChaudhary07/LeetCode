class Solution {
    public String addBinary(String a, String b) {
        int lena=a.length()-1;
        int lenb=b.length()-1;
       
        String res="";
        int carry=0;
        while(lena>=0 || lenb>=0){
            int sum=0;
            if(lena>=0){
                int na=a.charAt(lena)-'0';
                sum+=na;
                lena--;
            }
            if(lenb>=0){
                int nb=b.charAt(lenb)-'0';
                sum+=nb;
                lenb--;
            }
            
            int sum1=(sum+carry)%2;
            carry=(sum+carry)/2;
            // System.out.println(sum+","+carry);
            res=sum1+res;
            }
      
        if(carry==1)
            res=carry+res;
        return res;
    }
}