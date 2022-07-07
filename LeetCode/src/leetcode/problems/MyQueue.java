package leetcode.problems;

import java.util.Stack;

public class MyQueue {
	// Declaring Two Stacks
	Stack<Integer> s1;
	Stack<Integer> s2;
	int top;
	public MyQueue() {
        // Constructing the objects s1, and s2
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(s1.isEmpty()) top = x;
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()) {
        	while(!s1.isEmpty()) {
        		s2.push(s1.pop());
        	}
        }
        return s2.pop();
    }
    
    public int peek() {
        if(s2.isEmpty()) return top;
        else return s2.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty()) return true;
        return false;
    }
}
