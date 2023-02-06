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
    private void inorder(TreeNode root,List<Integer> lst){
          if(root==null){
            return;
        }
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
       
    }
    public TreeNode increasingBST(TreeNode root) {
      List<Integer> lst=new ArrayList<>();
        inorder(root,lst);
        TreeNode curr=new TreeNode(0);
        TreeNode root0=curr;
        for(int i:lst){
            TreeNode node =new TreeNode(i);
            curr.right=node;
            curr=curr.right;
        }
        return root0.right;
    }
}