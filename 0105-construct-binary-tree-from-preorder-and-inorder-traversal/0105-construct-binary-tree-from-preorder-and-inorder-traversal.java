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
    private int search(int[] in,int start,int end,int item){
        for(int i=start;i<=end;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
    
    private TreeNode CreateTree(int[] pre,int pstart,int pend,int[] in,int instart,int inend){
        if(pstart>pend || instart>inend){
            return null;
        }
        TreeNode node=new TreeNode(pre[pstart]);
        int ind=search(in,instart,inend,pre[pstart]);
        int elements=ind-instart;
        node.left=CreateTree(pre,pstart+1,pend+elements,in,instart,ind-1);
        node.right=CreateTree(pre,pstart+elements+1,pend,in,ind+1,inend);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return CreateTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}