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
        boolean isBst=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
    }
    
    public pair isBSTValid(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair left=isBSTValid(root.left);
        pair right=isBSTValid(root.right);
        pair newpair=new pair();
        if(left.isBst && right.isBst && left.max<root.val && right.min>root.val){
            newpair.isBst=true;
            newpair.max=Math.max(root.val,right.max);
            newpair.min=Math.min(root.val,left.min);
        }
        else{
            newpair.isBst=false;
            newpair.max=Math.max(root.val,Math.max(right.max,left.max));
            newpair.min=Math.min(root.val,Math.min(left.min,right.min));
        }
        return newpair;
    }
    public boolean isValidBST(TreeNode root) {
       return isBSTValid(root).isBst;
    }
}