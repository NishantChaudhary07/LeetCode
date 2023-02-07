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
    private int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(ht(root.left),ht(root.right))+1;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return null;
        }
        
        int lht=ht(root.left);
        int rht=ht(root.right);
        if(lht==rht){
            return root;
        }
        
        else if(lht<rht){
            return lcaDeepestLeaves(root.right);
        }
        else{
            return lcaDeepestLeaves(root.left);
        }
    }
}