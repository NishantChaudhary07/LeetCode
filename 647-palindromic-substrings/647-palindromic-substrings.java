class Solution {
    public int countSubstrings(String str) {
        int count=0;
		for(int i=0;i<str.length();i++){
			 int right=i;
		int left=i;
		while(left>=0 && right<str.length()){
            if(str.charAt(left)!=str.charAt(right)){
				break;
			}
			if(str.charAt(left)==str.charAt(right)){
				count+=1;
			}
			left--;
			right++;
		}
            
		}
        
        for(int i=1;i<str.length();i++){
		    int right=i;
		    int left=i-1;
		while(left>=0 && right<str.length()){
             if(str.charAt(left)!=str.charAt(right)){
				break;
			}
			if(str.charAt(left)==str.charAt(right)){
				count+=1;
			}
			left--;
			right++;
		}
            
		}
		return count;
    }
}