class BrowserHistory {
    private Stack<String> back,forward;
    private String curr;
    
    public BrowserHistory(String homepage) {
        back=new Stack<>();
        forward=new Stack<>();
        curr=homepage;
    }
    
    public void visit(String url) {
        back.push(curr);
        curr=url;
        forward=new Stack<>();
    }
    
    public String back(int steps) {
        while(steps>0 && !back.isEmpty()){
            forward.push(curr);
            curr=back.pop();
            steps--;
        }
        return curr;
    }
    
    public String forward(int steps) {
        while(steps>0 && !forward.isEmpty()){
            back.push(curr);
            curr=forward.pop();
            steps--;
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */