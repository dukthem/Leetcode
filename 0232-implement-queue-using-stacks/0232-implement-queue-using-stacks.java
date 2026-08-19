class MyQueue {
    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();

    public MyQueue() {
        Stack<Integer> S1 = new Stack<>();
        Stack<Integer> S2 = new Stack<>();
    }
    
    public void push(int x) {
        while (!S1.isEmpty()) {
            S2.push(S1.pop());
        }
        S1.push(x);
        while (!S2.isEmpty()) {
            S1.push(S2.pop());
        }

        
    }
    
    public int pop() {
        return S1.pop();
    }
    
    public int peek() {
        return S1.peek();
    }
    
    public boolean empty() {
        if (S1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */