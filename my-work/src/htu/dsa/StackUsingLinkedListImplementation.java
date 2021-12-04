package htu.dsa;

public class StackUsingLinkedListImplementation {
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		for(int i = 0; i < 1000; i++) {
			stack.push(i * 10);
		}
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
	}
}
