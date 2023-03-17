class Trie {
    HashSet<String> set;
    public Trie() {
        set=new HashSet<>();
    }
    
    public void insert(String word) {
        set.add(word);
    }
    
    public boolean search(String word) {
        if(set.contains(word)){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        for(String ele:set){
            if(ele.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */