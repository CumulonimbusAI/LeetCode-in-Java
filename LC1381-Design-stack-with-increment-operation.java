class CustomStack {
    private int[] stack;
    private int tos;

    // constructor
    public CustomStack(int maxSize) {
        // initialize stack
        stack = new int[maxSize];
        tos = -1;        
    }
    
    // FILO order - stack implementation 
    // Stack Ops
    public void push(int x) {
        // is stack full ..?
        if (tos == stack.length -1) {
            return;
        }
        tos++;
        stack[tos] = x;        
    }
    
    // eject top of the stack
    public int pop() {
        // is stack empty ?
        if(tos == -1) {
            return -1;
        }
        int val = stack[tos];
        tos--;
        return val;        
    }
    
    public void increment(int k, int val) {
        // traverse from bottom of stack until k elements and increment by "val"
        for (int i=0; i <= Math.min(tos,k-1); i++){
            stack[i] += val;
        }        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
