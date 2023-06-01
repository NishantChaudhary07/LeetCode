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
    private class Diapair{
        int height=0;
        boolean isbal=true;
    }
    public Diapair help(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair left=help(root.left);
        Diapair right=help(root.right);
        Diapair dp=new Diapair();
        dp.height=Math.max(left.height,right.height)+1;
        dp.isbal=right.isbal&&left.isbal&&(Math.abs(left.height-right.height)<=1);
        return dp;
    }
    public boolean isBalanced(TreeNode root) {
        return help(root).isbal;
    }
}