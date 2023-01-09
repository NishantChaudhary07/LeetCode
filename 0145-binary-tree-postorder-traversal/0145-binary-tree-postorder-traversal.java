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
    public void postorder(TreeNode root,List<Integer> lst){
        if(root==null){
            return;
        }
        
        postorder(root.left,lst);
        postorder(root.right,lst);
        lst.add(root.val);
        }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        postorder(root,lst);
        return lst;
    }
}