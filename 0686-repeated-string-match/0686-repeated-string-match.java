class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        String c="";
        while(c.length()<b.length()){
            c=c+a;
            count++;
        }
        if(c.contains(b)){
            return count;
        }
        c+=a;
        if(c.contains(b))
           return ++count;
        return -1;
    }
}