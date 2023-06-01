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
        int diameter=0;
        int height=0;
    }
    public Diapair diameterOfBT(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair leftdia=diameterOfBT(root.left);
        Diapair rightdia=diameterOfBT(root.right);
        Diapair dp=new Diapair();
        dp.height=Math.max(leftdia.height,rightdia.height)+1;
        dp.diameter=Math.max(leftdia.height+rightdia.height,Math.max(leftdia.diameter,rightdia.diameter));
        return dp;
    }
    public int diameterOfBinaryTree(TreeNode root) {
       return diameterOfBT(root).diameter;
    }
}