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
    private void preorder(TreeNode root,List<Integer> lst){
        if(root==null){
            return;
        }
        lst.add(root.val);
        preorder(root.left,lst);
        preorder(root.right,lst);
    }
    public void flatten(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        if(root==null){
            return;
        }
        preorder(root,lst);
        TreeNode curr=root;
        curr.left=null;
        curr.right=null;
        for( int i=1;i<lst.size();i++){
            TreeNode node=new TreeNode(lst.get(i));
            curr.right=node;
            curr=curr.right;
        }
        root=root.right;
    }
}