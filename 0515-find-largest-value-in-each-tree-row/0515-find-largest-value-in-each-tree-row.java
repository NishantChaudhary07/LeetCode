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
    public List<Integer> largestValues(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
      Queue<TreeNode> q1=new LinkedList<>();
        List<Integer> res=new LinkedList<>();
        if(root==null)
            return res;
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            if(rem.val>max)
                max=rem.val;
            if(rem.right!=null){
                q1.add(rem.right);
            }
            if(rem.left!=null){
                q1.add(rem.left);
            }
            
            if(q.isEmpty()){
                q=q1;
                q1=new LinkedList<>();
                res.add(max);
                max=Integer.MIN_VALUE;
            }
        }
        return res;
    }
}