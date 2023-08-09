/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node,Node> map=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));
        while(!q.isEmpty()){
            Node rem=q.poll();
            for(Node nbr:rem.neighbors){
                if(!map.containsKey(nbr)){
                    map.put(nbr,new Node(nbr.val,new ArrayList<>()));
                    q.add(nbr);
                }
                map.get(rem).neighbors.add(map.get(nbr));
            }
        }
        return map.get(node);
    }
}