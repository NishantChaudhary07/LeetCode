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
    public int countPath(TreeNode root,int target){
        if(root==null){
            return 0;
        }
        int count=0;
        if(target-root.val==0){
            count++;
        }
        count=count+countPath(root.left,target-root.val)+countPath(root.right,target-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        if(root.val>1000000){
            return 0;
        }
        int rooot=countPath(root,targetSum);
        int left=pathSum(root.left,targetSum);
        int right=pathSum(root.right,targetSum);
        return rooot+left+right;
    }
}