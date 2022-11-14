class Solution {
    public static boolean isSelfDividing(int n){
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            int digit=str.charAt(i)-'0';
            if(digit==0){
                return false;
            }
            else if(n%digit!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                lst.add(i);
            }
        }
        return lst;
    }
}