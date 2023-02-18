/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class pair{
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxsum=0;
    }
    int res=0;
    private pair maxSum(TreeNode root){
        if(root==null){
            return new pair();
        }
        
        pair lp=maxSum(root.left);
        pair rp=maxSum(root.right);
        
        if(lp==null || rp==null){
          return null;
        }
       if(root.val<=lp.max || root.val>=rp.min){
           return null;
       }
        pair newp=new pair();
        res=Math.max(res,lp.maxsum+rp.maxsum+root.val);
        newp.max=Math.max(rp.max,root.val);
        newp.min=Math.min(lp.min,root.val);
        newp.maxsum=lp.maxsum+rp.maxsum+root.val;
        return newp;
        
    }
    public int maxSumBST(TreeNode root) {
        maxSum(root);
        return res;
    }
}