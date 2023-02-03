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
class pair{
    int maxlen=0;
    int maxpath=Integer.MIN_VALUE;
}
class Solution {
    private pair maxlenpath(TreeNode root){
        if(root==null){
            return new pair();
        }
        
        pair lpair=maxlenpath(root.left);
        pair rpair=maxlenpath(root.right);
        
        pair newpair=new pair();
        newpair.maxlen=Math.max(0,Math.max(lpair.maxlen,rpair.maxlen)+root.val);
        newpair.maxpath=Math.max(lpair.maxlen+rpair.maxlen+root.val,Math.max(lpair.maxpath,rpair.maxpath));
        return newpair;
    }
    public int maxPathSum(TreeNode root) {
        return maxlenpath(root).maxpath;
    }
}