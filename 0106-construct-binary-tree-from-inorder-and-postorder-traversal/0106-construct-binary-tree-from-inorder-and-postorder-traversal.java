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
    private int search(int[] in,int instart,int inend,int item){
        for(int i=instart;i<=inend;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
    
    private TreeNode CreateTree(int[] in,int instart,int inend,int[] post,int poststart,int postend){
        if(postend<0 || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(post[postend]);
        int ind=search(in,instart,inend,post[postend]);
        int leftlen=ind-instart;
        root.right=CreateTree(in,ind+1,inend,post,poststart+leftlen,postend-1);
        root.left=CreateTree(in,instart,ind-1,post,poststart,poststart+leftlen-1);
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return CreateTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
}