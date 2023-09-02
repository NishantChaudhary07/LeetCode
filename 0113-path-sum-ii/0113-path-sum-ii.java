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
    public void path(TreeNode root,int target,List<Integer> lst,List<List<Integer>>res){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(target-root.val==0){
                lst.add(root.val);
                res.add(new ArrayList<>(lst));
                lst.remove(lst.size()-1);
            }
            return;
        }
        lst.add(root.val);
        path(root.left,target-root.val,lst,res);
        path(root.right,target-root.val,lst,res);
        lst.remove(lst.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        path(root,targetSum,lst,res);
        return res;
    }
}