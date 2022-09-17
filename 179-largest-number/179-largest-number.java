class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr=new ArrayList<>();
        for(int ele:nums){
            arr.add(String.valueOf(ele));
        }
        
        Collections.sort(arr,(a,b)->{
            String x=a+b;
            String y=b+a;
            return y.compareTo(x);
        });
        String res="";
        for(int i=0;i<arr.size();i++){
            res+=arr.get(i);
        }
        if(res.charAt(0)=='0')
            return "0";
        return res;
    }
}