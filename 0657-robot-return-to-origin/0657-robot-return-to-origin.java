class Solution {
    public boolean judgeCircle(String moves) {
        int hor=0,ver=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                hor--;
            }
            if(ch=='D'){
                hor++;
            }
            if(ch=='L'){
                ver--;
            }
            if(ch=='R'){
                ver++;
            }
        }
        if(hor==0 && ver==0){
            return true;
        }
        else{
            return false;
        }
    }
}