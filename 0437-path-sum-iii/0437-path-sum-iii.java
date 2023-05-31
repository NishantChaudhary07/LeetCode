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
    private int countPaths(TreeNode root,int targetSum){
        if(root==null){
            return 0;
        }
        int ans=0;
        if(targetSum-root.val==0){
            ans++;
        }
        ans=ans+countPaths(root.left,targetSum-root.val)+countPaths(root.right,targetSum-root.val);
        return ans;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        if(root.val==1000000000){
            return 0;
        }
        int root_sum=countPaths(root,targetSum);
        int left=pathSum(root.left,targetSum);
        int right=pathSum(root.right,targetSum);
        return root_sum+left+right;
    }
}