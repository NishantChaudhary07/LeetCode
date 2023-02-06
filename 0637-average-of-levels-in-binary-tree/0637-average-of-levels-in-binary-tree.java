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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> q0=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        q.add(root);
        double sum=0;
        int count=0;
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            sum+=rem.val;
            count++;
            if(rem.left!=null){
                q0.add(rem.left);
            }
            if(rem.right!=null){
                q0.add(rem.right);
            }
            
            if(q.isEmpty()){
                ans.add(sum/count);
                q=q0;
                q0=new LinkedList<>();
                sum=0;
                count=0;
            }
        }
        return ans;
    }
}