class Solution {
    public boolean checkPowersOfThree(int n) {
      for(int i=14;i>=0;i--){
          int pow3=(int)Math.pow(3,i);
          if(n-pow3>=0){
              n=n-pow3;
          }
          if(n==0){
              return true;
          }
      }
return false;
    }
}