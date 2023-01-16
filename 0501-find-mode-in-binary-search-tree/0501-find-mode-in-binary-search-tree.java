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
     Map<Integer,Integer> map=new HashMap<>();
    private void freq(TreeNode root){
        if(root==null)
            return ;
        if(map.containsKey(root.val)){
                map.put(root.val,map.get(root.val)+1);
            }
        else{
            map.put(root.val,1);
        }
        freq(root.left);
        freq(root.right);
    }
    public int[] findMode(TreeNode root) {
        freq(root);
        int max=Collections.max(map.values());
        List<Integer> lst=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==max){
                lst.add(key);
            }
        }
        int[] arr=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}