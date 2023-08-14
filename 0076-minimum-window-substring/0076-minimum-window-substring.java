class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character,Integer> freq_t=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freq_t.put(ch,freq_t.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> freq_s=new HashMap<>();
        int mct=0;
        int dmct=t.length();
        int i=-1;
        int j=-1;
        
        while(true){
            boolean loop1=false;
            boolean loop2=false;
            while(i<s.length()-1 && mct<dmct){
                i++;
                char ch=s.charAt(i);
                freq_s.put(ch,freq_s.getOrDefault(ch,0)+1);
                if(freq_s.getOrDefault(ch,0)<=freq_t.getOrDefault(ch,0)){
                    mct++;
                }
                loop1=true;
            }
            while(j<i && mct==dmct){
                String currans=s.substring(j+1,i+1); 
                  if(ans.length()==0 || currans.length()<ans.length()){
                    ans=currans;
                }
                j++;
                char ch=s.charAt(j);

                if(freq_s.get(ch)==1){
                    freq_s.remove(ch);
                }
                else{
                    freq_s.put(ch,freq_s.get(ch)-1);
                }
                if(freq_s.getOrDefault(ch,0)<freq_t.getOrDefault(ch,0)){
                    mct--;
                }
              
                loop2=true;
            }
            if(!loop1 && !loop2){
                break;
            }
        }
        return ans;
    }
}