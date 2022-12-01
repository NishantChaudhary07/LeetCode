class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length()/2;
        String str1=s.substring(0,n);
        String str2=s.substring(n);
        int v1=0;
        int v2=0;
        List<Character> vowels=new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0;i<n;i++){
            if(vowels.contains(str1.charAt(i))){
                v1++;
            }
            if(vowels.contains(str2.charAt(i))){
                v2++;
            }
        }
        return v1==v2;
    }
}