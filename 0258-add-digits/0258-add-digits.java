class Solution {
    public static int digitSum(int num){
        int sum=0;
        while(num!=0){
            int dig=num%10;
            sum+=dig;
            num=num/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        
        while(num>9)
        {
            int sum=digitSum(num);
            num=sum;
        }
        return num;
    }
}