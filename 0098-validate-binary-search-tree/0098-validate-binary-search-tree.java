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
class bstpair{
    boolean isbst=true;
    long max=Long.MIN_VALUE;
    long min=Long.MAX_VALUE;
}
class Solution {
    private bstpair isvalidbst(TreeNode root){
        if(root==null){
            return new bstpair();
        }
        bstpair lbst=isvalidbst(root.left);
        bstpair rbst=isvalidbst(root.right);
        bstpair bst=new bstpair();
        if(lbst.isbst==true && rbst.isbst==true && root.val>lbst.max && root.val<rbst.min){
            bst.isbst=true;
            bst.min=Math.min(lbst.min,root.val);
            bst.max=Math.max(rbst.max,root.val);
            return bst;
        }
        
        bst.isbst=false;
        bst.min=Math.min(lbst.min,Math.min(rbst.min,root.val));
        bst.max=Math.max(lbst.max,Math.max(rbst.max,root.val));
        return bst;
    }
    public boolean isValidBST(TreeNode root) {
        // System.out.print(isvalidbst(root).min);
        return isvalidbst(root).isbst;
    }
}