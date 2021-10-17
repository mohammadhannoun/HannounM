package revision;

public class StackImplementation {
	public static void main(String[] args) {
		Stack stack = new Stack();
			stack.push(5);
			stack.push(6);
			stack.push(7);
			stack.push(8);
			stack.pop();
			stack.removeAt(1);
			stack.removeAt(1);

			stack.showStack();
	}
}
