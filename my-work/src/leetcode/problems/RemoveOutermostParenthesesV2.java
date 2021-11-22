package leetcode.problems;
import java.util.Stack;
public class RemoveOutermostParenthesesV2 {
	public static void main(String[] args) {
		String s = "(((((((((())))))))))";
		System.out.println(removeOuterParentheses(s));
	} 
	public static String removeOuterParentheses(String s) {
		  char[] arr = s.toCharArray();
		  Stack<Character> stack = new Stack<>();
	      StringBuilder st = new StringBuilder();
	      int cntr = 1;
	      	for(int i = 1; i < arr.length; i++) {
	      		if(arr[i] == '(') {
	      			stack.push('('); 
	      			cntr++;
	      		}
	      		else {
	      			stack.push(')'); 
	      			cntr--;
	      		}
	      		if(cntr == 0) {
	      			i++;
	      			stack.pop();
	      			cntr = 1;
	      		}
	      	}
	      	for(int j = 0; j < stack.size(); j++) {
	      		st.append(stack.get(j));
	      	}
	      	return st.toString();
	}
}
