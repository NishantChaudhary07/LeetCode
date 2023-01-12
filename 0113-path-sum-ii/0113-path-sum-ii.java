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
    private void path(TreeNode root,int targetSum,List<List<Integer>> lst,List<Integer> lst1){
     if(root==null){
            return;
        }  
        
     if(root.left==null && root.right==null){
         if(targetSum-root.val==0){
             lst1.add(root.val);
             lst.add(new ArrayList<Integer>(lst1));
             lst1.remove(lst1.size()-1);
         }
         return;
         }
        
         lst1.add(root.val);
         path(root.left,targetSum-root.val,lst,lst1);
         path(root.right,targetSum-root.val,lst,lst1);
        lst1.remove(lst1.size()-1);
         

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> lst1=new ArrayList<>();
        path(root,targetSum,lst,lst1);
        return lst;
    }
}