class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt=Math.sqrt(num);
        if(sqrt==Math.floor(sqrt)){
            return true;
        }
        return false;
    }
}