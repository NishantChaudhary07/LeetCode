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
    private class diapair{
        int height=0;
        int dia=0;
    }
    
    private diapair pair(TreeNode root){
        if(root==null){
            return new diapair();
        }
        diapair ld=pair(root.left);
        diapair rd=pair(root.right);
        diapair dp=new diapair();
        dp.height=Math.max(ld.height,rd.height)+1;
        dp.dia=Math.max(ld.height+rd.height,Math.max(ld.dia,rd.dia));
        return dp;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        return pair(root).dia;
    }
}