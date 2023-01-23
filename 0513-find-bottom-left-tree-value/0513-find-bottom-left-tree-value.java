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
    public int findBottomLeftValue(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
      Queue<TreeNode> q1=new LinkedList<>();
        q.add(root);
        int res=-1;
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            res=rem.val;
            if(rem.right!=null){
                q1.add(rem.right);
            }
            if(rem.left!=null){
                q1.add(rem.left);
            }
            
            if(q.isEmpty()){
                q=q1;
                q1=new LinkedList<>();
            }
        }
        return res;
    }
}