package leetcode.problems;

import java.util.Stack;

public class BaseballGameV2 {
	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
			for(int i = 0; i < ops.length; i++) {
				switch(ops[i]) {
				case("C"):
					stack.pop();
						break;
				case("D"):
					stack.push(stack.peek()*2);
						break;
				case("+"):
					int som = 0;
					som += stack.peek();
					int temp = stack.peek();
					stack.pop();
					som += stack.peek();
					stack.push(temp);
					stack.push(som);
						break;
				default:
					stack.push(Integer.valueOf(ops[i]));
					break;
				}
			}
			int sum = 0;
			while(!stack.isEmpty()) {
				sum += stack.peek();
				stack.pop();
			}
			return sum;
	}
}
