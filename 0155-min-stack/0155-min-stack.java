class MinStack {
    Stack<Integer> MinStack = new Stack<>(); 
    Stack<Integer> Stack = new Stack<>(); 
    public MinStack() {
      Stack<Integer> MinStack = new Stack<>(); 
    }
    
    public void push(int value) {
        MinStack.push(value);
        if (Stack.isEmpty() || value <= Stack.peek()) {
            Stack.push(value);
        }
        
    }
    
    public void pop() {
        if (Stack.peek().equals(MinStack.peek())) {
            Stack.pop();
        }
        MinStack.pop();
    }
    
    public int top() {
        return MinStack.peek();
    }
    
    public int getMin() {
        // System.out.println(Stack);

        return Stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */