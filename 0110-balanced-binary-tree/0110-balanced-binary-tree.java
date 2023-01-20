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
    private class BalancePair{
        int ht=-1;
        boolean isbal=true;
    }
    
    private BalancePair balancePair(TreeNode root){
        if(root==null){
            return new BalancePair();
        }
        BalancePair lbp=balancePair(root.left);
        BalancePair rbp=balancePair(root.right);
        BalancePair nbp=new BalancePair();
        nbp.ht=Math.max(lbp.ht,rbp.ht)+1;
        int bf=Math.abs(lbp.ht-rbp.ht);
        nbp.isbal=lbp.isbal && rbp.isbal && bf<=1;
        return nbp;
        
    }
    public boolean isBalanced(TreeNode root) {
        return balancePair(root).isbal;
    }
}