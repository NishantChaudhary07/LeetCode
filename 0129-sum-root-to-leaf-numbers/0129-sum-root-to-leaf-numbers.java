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
    private int sum(TreeNode root,int sum,int num){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            num=num*10+root.val;
            sum+=num;
            return sum;
        }
        return sum(root.left,sum,num*10+root.val)+ sum(root.right,sum,num*10+root.val);
        
    }
    public int sumNumbers(TreeNode root) {
        return sum(root,0,0);
    }
}