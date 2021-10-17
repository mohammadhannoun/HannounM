package leetcode.problems;
import java.util.*;
public class BaseballGame {
	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
			for(int i = 0; i < ops.length; i++) {
				if(ops[i].equals("C")) {
					stack.pop();
				}
				else if(ops[i].equals("D")) {
					stack.push(stack.peek()*2);
				}
				else if(ops[i].equals("+")) {
					int som = 0;
					som += stack.peek();
					int temp = stack.peek();
					stack.pop();
					som += stack.peek();
					stack.push(temp);
					stack.push(som);
				}
				else {
					stack.push(Integer.valueOf(ops[i]));
				}
			}
			int sum = 0;
			while(!stack.isEmpty()) {
				sum += stack.peek();
				stack.pop();
			}
			return sum;
	}
	public static void main(String[] args) {
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		int sum = calPoints(ops);
		System.out.println(sum);
	}
}
