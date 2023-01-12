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
    private int sum(TreeNode root,int num){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            num=num*10+root.val;
            return num;
        }
        return sum(root.left,num*10+root.val)+ sum(root.right,num*10+root.val);
        
    }
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
}