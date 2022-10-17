class Solution {
    public static boolean isAnagram(char[] chp,char[] chs){
      for(int i=0;i<chp.length;i++){
          if(chp[i]!=chs[i])
              return false;  
      }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())
            return new ArrayList<Integer>();
        List<Integer> list=new ArrayList<>();
        char[] chp=new char[26];
        char[] chs=new char[26];
        int len=p.length();
        for(int i=0;i<len;i++){
            chp[p.charAt(i)-'a']++;
        }
        
        int start=0,end=0;
        for(;end<len;end++){
           chs[s.charAt(end)-'a']++;
        }
        if(isAnagram(chp,chs)){
            list.add(start);
        }
        for(;end<s.length();end++){
            chs[s.charAt(start)-'a']--;
            chs[s.charAt(end)-'a']++;
            start++;
            if(isAnagram(chp,chs)){
            list.add(start);
        }

        }
            
        return list;
    }
}