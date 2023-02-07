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

/*public TreeNode dfs(TreeNode node,int level){
if(node==null) return null;
if(level==maxDepth) return node;
TreeNode left=dfs(node.left,level+1);
TreeNode right=dfs(node.right,level+1);
if(left!=null && right!=null) return node;
if(left!=null) return left;
if(right!=null) return right;
return null;
}*/
class Solution {
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null){
            return null;
        }
        
        int lht=height(root.left);
        int rht=height(root.right);
        if(lht==rht){
            return root;
        }
        
        else if(lht<rht){
            return subtreeWithAllDeepest(root.right);
        }
        else{
            return subtreeWithAllDeepest(root.left);
        }
    }
}