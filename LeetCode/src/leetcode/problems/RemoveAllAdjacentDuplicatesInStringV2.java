package leetcode.problems;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringV2 {
	public static void main(String[] args) {
		char[] c = {'a', 'b', 'c'};
		System.out.println(new String(c, 0, 2));
	} 
	public static String removeDuplicates(String s) {
		 Stack<Character> stack = new Stack<Character>();
         StringBuilder sb = new StringBuilder();
		 	for(int i = 0; i < s.length(); i++) {
		 		if(!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop(); 
                else stack.push(s.charAt(i));
		 	}
		 while(!stack.isEmpty()) sb.append(stack.pop());
		 return sb.reverse().toString();
	 }
}
