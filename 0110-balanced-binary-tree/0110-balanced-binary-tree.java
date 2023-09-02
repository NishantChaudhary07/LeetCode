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
    public class pair{
        int ht;
        boolean isbal=true;
    }
    public pair BalancedTree(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair left=BalancedTree(root.left);
        pair right=BalancedTree(root.right);
        pair newpair=new pair();
        newpair.ht=Math.max(left.ht,right.ht)+1;
        newpair.isbal= left.isbal && right.isbal && Math.abs(left.ht-right.ht)<=1;
        return newpair;
    }
    public boolean isBalanced(TreeNode root) {
        return BalancedTree(root).isbal;
    }
}