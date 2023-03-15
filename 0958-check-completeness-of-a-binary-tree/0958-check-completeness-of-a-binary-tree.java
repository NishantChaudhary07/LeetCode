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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean nodeNotFound=false;
        while(!q.isEmpty()){
            TreeNode rem=q.poll();
            if(rem==null){
                nodeNotFound=true;
            }
            else{
                if(nodeNotFound){
                    return false;
                }
                 q.offer(rem.left);
                 q.offer(rem.right);
            }
        }
        return true;
    }
}