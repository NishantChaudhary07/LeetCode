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
    public void rightView(TreeNode root,List<Integer> res,int curr){
        if(root==null){
            return;
        }
        if(curr>res.size()){
            res.add(root.val);
        }
        rightView(root.right,res,curr+1);
        rightView(root.left,res,curr+1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> res=new ArrayList<>(); 
        rightView(root,res,1);
        return res;
    }
}