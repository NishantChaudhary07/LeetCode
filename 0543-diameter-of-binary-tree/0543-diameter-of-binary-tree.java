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
    class diapair{
        int ht=-1;
        int d=0;
    }
    
    public diapair htnddia(TreeNode root){
        if(root==null){
            return new diapair();
        }
        
        diapair ldp=htnddia(root.left);
        diapair rdp=htnddia(root.right);
        diapair sdp=new diapair();
        
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        sdp.d=Math.max(ldp.d,Math.max(rdp.d,ldp.ht+rdp.ht+2));
        return sdp; 
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return htnddia(root).d;
    }
}