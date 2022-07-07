package leetcode.problems.revision;

import java.util.Stack;

public class BackspaceStringCompareV1 {
	 public boolean backspaceCompare(String s, String t) {
			Stack<Character> s1 = getRes(s), s2 = getRes(t);
			
			if(s1.isEmpty() && s2.isEmpty()) return true;
			else if(s1.size() != s2.size()) return false;
		
			while(!s1.isEmpty()){
				if(s1.peek() != s2.peek()) return false;
				else s1.pop(); s2.pop();
			}
			return true;
			
		} public Stack<Character> getRes(String s){
			Stack<Character> s1 = new Stack<Character>();
			for(int i = 0; i < s.length(); i++) {
				if((!s1.isEmpty()) && s.charAt(i) == '#') s1.pop();
	            else if(s.charAt(i) != '#') s1.push(s.charAt(i));
			}
			return s1;
		}
}
