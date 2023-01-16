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
    private boolean isValid(TreeNode root,TreeNode left,TreeNode right){
        if(root==null){
            return true;
        }
        if((left!=null && root.val<=left.val) || (right!=null && root.val>=right.val)){
            return false;
        }
        return isValid(root.left,left,root) && isValid(root.right,root,right);
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
}