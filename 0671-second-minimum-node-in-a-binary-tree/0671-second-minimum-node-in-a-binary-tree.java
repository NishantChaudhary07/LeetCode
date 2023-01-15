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
    public void inorder(TreeNode root,TreeSet<Integer> tree){
        if(root==null){
            return;
        }
        tree.add(root.val);
        inorder(root.left,tree);
        inorder(root.right,tree);
    }
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> tree=new TreeSet<>();
        inorder(root,tree);
        int res=0;
        int k=0;
        for(int i:tree){
            if(k==1){
                return i;
            }
            k++;
        }
        return -1;
    }
}