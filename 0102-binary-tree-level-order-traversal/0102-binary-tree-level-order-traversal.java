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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        List<Integer> lst=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            TreeNode rem=q1.poll();
            lst.add(rem.val);
            if(rem.left!=null){
                q2.add(rem.left);
            }
            if(rem.right!=null){
                q2.add(rem.right);
            }
            if(q1.isEmpty()){
                q1=q2;
                q2=new LinkedList<>();
                res.add(lst);
                lst=new ArrayList<>();
            }
        }
        return res;
    }
}