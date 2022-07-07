package leetcode.problems;
import java.util.Stack;
public class RemoveOutermostParentheses {
	public static void main(String[] args) {
		String s = "()()";
		System.out.println(removeOuterParentheses(s));
	} 
	public static String removeOuterParentheses(String s) {
		   Stack<Character> stack = new Stack<>();
	        String res = "";
	        int i = -1;
	        while(s.length() > 1) {
	        	i++;
	        	if(s.charAt(i) == '(') {
	        		stack.push('('); 
	        	}
	        	else {
	        		stack.pop();
	        	}
	        	if(stack.isEmpty()) {
	        		res += s.substring(1, i);
	        		s = s.substring(i + 1);
	        		i = -1;
	       }
	    }
	        return res;
	}
}
