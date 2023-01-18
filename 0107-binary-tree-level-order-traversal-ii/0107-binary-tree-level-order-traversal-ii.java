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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        
        if(root==null){
            return res;
        }
        q.add(root);
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
            res.add(0,lst);
            lst=new ArrayList<>();
            q=q1;
            q1=new LinkedList<>();
        }
        }
      
        return res;
    }
}