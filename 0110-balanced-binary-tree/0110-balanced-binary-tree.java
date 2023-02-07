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
    private class pair{
        int ht=0;
        boolean isbal=true;
    }
    
    private pair Pair(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair lp=Pair(root.left);
        pair rp=Pair(root.right);
        pair np=new pair();
        np.ht=Math.max(lp.ht,rp.ht)+1;
        np.isbal=lp.isbal && rp.isbal && Math.abs(lp.ht-rp.ht)<=1;
        return np;
     }
    public boolean isBalanced(TreeNode root) {
        return Pair(root).isbal;
    }
}