/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<>();
        Queue<Node> q1=new LinkedList<>();
        if(root==null){
            return null;
        }
        q.add(root);
        while(!q.isEmpty()){
            Node rem=q.remove();
            if(rem.left!=null){
                q1.add(rem.left);
            }
            if(rem.right!=null){
                q1.add(rem.right);
            }
            rem.next=q.peek();
            if(q.isEmpty()){
                rem.next=null;
                q=q1;
                q1=new LinkedList<>();
            }
        }
        return root;
    }
}