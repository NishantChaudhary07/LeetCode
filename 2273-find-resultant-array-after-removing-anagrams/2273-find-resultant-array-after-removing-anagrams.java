class Solution {
    public static boolean isAnagram(String st1,String st2){
        if(st1.length()!=st2.length())
            return false;
        char[] arr1=st1.toCharArray();
        char[] arr2=st2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1=new String(arr1);
        String s2=new String(arr2);
        if(s1.equals(s2))
            return true;
        else 
            return false;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            list.add(words[i]);
        }
        int i=1;
        while(i!=list.size()){
            if(isAnagram(list.get(i-1),list.get(i))){
                list.remove(i);
            }
            else{
                i++;
            }
        }
        return list;
    }
}