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
    private void rightView(TreeNode root,List<Integer> lst,int curr){
        if(root==null){
            return;
        }
        
        if(curr>lst.size()){
            lst.add(root.val);
        }
        rightView(root.right,lst,curr+1);
        rightView(root.left,lst,curr+1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> lst=new ArrayList<>();
        rightView(root,lst,1);
        return lst;
    }
}