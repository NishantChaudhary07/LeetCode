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
        boolean isBst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    public Diapair validBst(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair left=validBst(root.left);
        Diapair right=validBst(root.right);
        Diapair dp=new Diapair();
        if(left.isBst==true && right.isBst==true && left.max<root.val && right.min>root.val){
            dp.isBst=true;
            dp.min=Math.min(root.val,left.min);
            dp.max=Math.max(root.val,right.max);
            return dp;
        }
        
        dp.isBst=false;
        dp.min=Math.min(root.val,Math.min(left.min,right.min));
        dp.max=Math.max(root.val,Math.max(left.max,right.max));
        return dp;
    }
    
    public boolean isValidBST(TreeNode root) {
        return validBst(root).isBst;
    }
}