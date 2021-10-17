package leetcode.problems;
import java.util.*;
public class ValidParantheses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write Here : ");
		String s = scan.nextLine();
		System.out.println(String.valueOf(isValid(s)));
		scan.close();
	}
	public static boolean isValid(String s) {
		Stack<Character> myStack = new Stack<>();
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(c == '(' || c == '[' || c == '{') {
					myStack.push(s.charAt(i));
				}else if(!myStack.isEmpty() && c == ')' && myStack.peek() == '(') {
					myStack.pop();
				}else if(!myStack.isEmpty() && c == ']' && myStack.peek() == '[') {
					myStack.pop();
				}else if(!myStack.isEmpty() && c == '}' && myStack.peek() == '{') {
					myStack.pop();
				}else {
					return false;
				}
			}
			return myStack.isEmpty();
	}
	
}
