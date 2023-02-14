class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res=new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while(i>=0 || k>0){
            int sum=0;
            if(i>=0){
                sum+=num[i];
                i--;
            }
            
            if(k>0){
                sum+=k%10;
                k=k/10;
            }
            int sum1=(sum+carry)%10;
            carry=(sum+carry)/10;
            res.add(0,sum1);
        }
        if(carry!=0){
            res.add(0,carry);
        }
        return res;
    }
}