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
        if(node==null)
            return null;
        HashMap<Node,Node> map=new HashMap<>();
        Queue<Node> que=new LinkedList<>();
        
        que.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));
        while(!que.isEmpty()){
            Node rem=que.remove();
            
            for(Node nbr:rem.neighbors){
                if(!map.containsKey(nbr)){
                    map.put(nbr,new Node(nbr.val,new ArrayList<>()));
                    que.add(nbr);
                }
                map.get(rem).neighbors.add(map.get(nbr));
            }
        }
        return map.get(node);
    }
}