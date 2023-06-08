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
    public int houseRob(TreeNode root,HashMap<TreeNode,Integer> dp){
        if(root==null){
            return 0;
        }
        int rob=root.val;
        if(dp.containsKey(root)){
            return dp.get(root);
        }
        if(root.left!=null){
            rob+=houseRob(root.left.left,dp)+houseRob(root.left.right,dp);
        }
        if(root.right!=null){
            rob+=houseRob(root.right.left,dp)+houseRob(root.right.right,dp);
        }
        int dont_rob=houseRob(root.left,dp)+houseRob(root.right,dp);
         dp.put(root,Math.max(rob,dont_rob));
        return dp.get(root);
    }
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer> dp=new HashMap<>();
        return houseRob(root,dp);
    }
}