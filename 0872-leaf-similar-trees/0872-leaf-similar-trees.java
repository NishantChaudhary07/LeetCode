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
    private void leafs(TreeNode root,List<Integer> lst){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            lst.add(root.val);
        }
        leafs(root.left,lst);
        leafs(root.right,lst);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();
        leafs(root1,lst1);
        leafs(root2,lst2);
        if(lst1.size()!=lst2.size()){
            return false;
        }
        for(int i=0;i<lst1.size();i++){
            if(lst1.get(i)!=lst2.get(i)){
                return false;
            }
        }
        return true;
    }
}