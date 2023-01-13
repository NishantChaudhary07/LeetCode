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
    private void path(TreeNode root,String str,List<String> lst){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            str+=root.val;
            lst.add(str);
        }
        str=str+root.val+"->";
        path(root.left,str,lst);
        path(root.right,str,lst);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst=new ArrayList<>();
        path(root,"",lst);
        return lst;
    }
}