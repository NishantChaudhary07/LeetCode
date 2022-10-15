class Solution {
    public static int digitSum(int n){
         int res=0;
        while(n!=0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            str+=((int)s.charAt(i)-96);
        }
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(str.charAt(i)-'0');
        }
        
            while(k!=1){
                int sum1=digitSum(sum);
                sum=sum1;
                k--;
            }
        return sum;
    }
}