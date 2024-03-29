class Trie {
     public  class Node{
        char ch ;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isterminal = false;
    }
    private Node root;
    public Trie(){
        Node nn = new Node();
        nn.ch ='*';
        this.root = nn;
    }
    
    public void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch))
                curr=curr.child.get(ch);
            else {
                Node nn =  new Node();
                nn.ch = ch;
                curr.child.put(ch,nn);
                curr =nn;
            }
        }
        curr.isterminal=true;
    }
    
    public boolean search (String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch))
                return false;

            curr=curr.child.get(ch);

        }
        return curr.isterminal;
    }
    
    public boolean startsWith(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch))
                return false;

            curr=curr.child.get(ch);

        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */