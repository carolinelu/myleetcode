package leetcode;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> min = new Stack<Integer>();
	
	public void push(int x) {
        if(min.empty() || (!min.empty() && min.peek() >= x)){
        	min.push(x);
        }
        stack.push(x);
    }

    public void pop() {
    	if(!stack.empty()){
    		
            if(stack.peek().equals(min.peek())){
            	min.pop();
            }
            stack.pop();
    	}
    }

    public int top() {
    	if(!stack.empty()){
    		return stack.peek();
    	}
    	return 0;
        
    }

    public int getMin() {
    	if(!min.empty()){
    		return min.peek();
    	}
    	return 0;
    }
}
