package htu.dsa;

public class StackUsingArrayImplementation {
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.top());
		
		stack.push(55);
		System.out.println(stack.top());
	}
}
