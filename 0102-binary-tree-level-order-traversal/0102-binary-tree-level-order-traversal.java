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
     Queue<TreeNode> q=new LinkedList<>();
     Queue<TreeNode> q1=new LinkedList<>();
     List<Integer> lst=new ArrayList<>();
     List<List<Integer> > res=new ArrayList<>(); 
        q.add(root);
        if(root==null){
            return res;
        }
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            lst.add(rem.val);
            if(rem.left!=null){
                q1.add(rem.left);
            }
            if(rem.right!=null){
                q1.add(rem.right);
            }
            if(q.isEmpty()){
                res.add(lst);
                lst=new ArrayList<>();
                q=q1;
                q1=new LinkedList<>();
            }
        }
        return res;
    }
}