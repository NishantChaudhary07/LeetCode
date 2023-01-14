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
    
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        
        if(root.right==null && root.left==null){
            return 1;
        }
        
        if(root.right==null){
            return 1+left;
        }
        
         if(root.left==null){
            return 1+right;
        }
        return Math.min(right,left)+1;
    }
}