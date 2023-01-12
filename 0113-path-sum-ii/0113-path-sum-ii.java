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
    private boolean path(TreeNode root,int targetSum,List<List<Integer>> lst,List<Integer> lst1){
     if(root==null){
            return false;
        }  
        
     if(root.left==null && root.right==null){
         if(targetSum-root.val==0){
             lst1.add(root.val);
             lst.add(new ArrayList<Integer>(lst1));
             lst1.remove(lst1.size()-1);
         }
         return targetSum-root.val==0;
         }
        
         lst1.add(root.val);
         boolean left=path(root.left,targetSum-root.val,lst,lst1);
         boolean right=path(root.right,targetSum-root.val,lst,lst1);
        lst1.remove(lst1.size()-1);
         return left || right;

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> lst1=new ArrayList<>();
        path(root,targetSum,lst,lst1);
        return lst;
    }
}