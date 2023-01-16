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
    int prev=Integer.MIN_VALUE;
    int maxFreq=0;
    int currFreq=0;
    private void inorder(TreeNode root,List<Integer> lst){
        if(root==null){
            return;
        }
        inorder(root.left,lst);
        if(prev==root.val){
            currFreq++;
        }
        else
           currFreq=1;
        
            if(currFreq>maxFreq){
                lst.clear();
                lst.add(root.val);
                maxFreq=currFreq;
            }
            else if(currFreq==maxFreq){
                lst.add(root.val);
            }
            
         prev=root.val;
        
        inorder(root.right,lst);
    }
    public int[] findMode(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        inorder(root,lst);
        int[] arr=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}