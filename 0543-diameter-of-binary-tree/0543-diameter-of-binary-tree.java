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
        int dia;
    }
    public pair diaPair(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair left=diaPair(root.left);
        pair right=diaPair(root.right);
        pair diap=new pair();
        diap.ht=Math.max(left.ht,right.ht)+1;
        diap.dia=Math.max(left.ht+right.ht,Math.max(left.dia,right.dia));
        return diap;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diaPair(root).dia;
    }
}