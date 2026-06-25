class MinStack {
     static Stack<Integer> main;
     static Stack<Integer> min;
    public MinStack() {
        main=new Stack<>();
        min= new Stack<>();
        
    }
    
    public void push(int val) {
        min.push(min.isEmpty()?val:Math.min(val,min.peek()));
        main.push(val);
    }
    
    public void pop() {
        min.pop();
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
