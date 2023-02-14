class Solution {
    public String addBinary(String a, String b) {
        int lena=a.length();
        int lenb=b.length();
       
        String res="";
        int carry=0;
        while(true){
            int nb=b.charAt(lenb-1)-'0';
            int na=a.charAt(lena-1)-'0';
            int sum=(nb+na+carry)%2;
            carry=(nb+na+carry)/2;
            res=sum+res;
            lena--;
            lenb--;
             if(lena==0 || lenb==0){
                break;
            }
        }
        if(lena!=0){
             lena--;  
        while(lena>=0){
            int na=a.charAt(lena)-'0';
            int sum=(na+carry)%2;
            carry=(na+carry)/2;
            res=sum+res;
            lena--;
        }
        }
        if(lenb!=0){
             lenb--;
            while(lenb>=0){
                int nb=b.charAt(lenb)-'0';
            int sum=(nb+carry)%2;
            carry=(nb+carry)/2;
            res=sum+res;
            lenb--;
        }
        }
        if(carry==1)
            res=carry+res;
        return res;
    }
}