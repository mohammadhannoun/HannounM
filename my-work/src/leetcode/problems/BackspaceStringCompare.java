package leetcode.problems;

import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String[] args) {
		System.out.println(backspaceCompare("ab#c", "ad#c"));
	} 
	public static boolean backspaceCompare(String s, String t) {
	        if(setString(s).equals(setString(t))) return true;
	        return false;
	        
	 }
	public static String setString(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
	        	if(s.charAt(i) != '#') stack.push(s.charAt(i));
	        	else
	        		if(!stack.isEmpty())stack.pop();
	        		else continue;
	        }
	        s = "";
	        if(stack.isEmpty()) s = "";
	        else while(!stack.isEmpty()) {
	        	s += stack.pop();
	        }
	        return s;
	}
}
