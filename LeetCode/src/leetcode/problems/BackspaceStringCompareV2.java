package leetcode.problems;
import java.util.Stack;
public class BackspaceStringCompareV2 {
	public static void main(String[] args) {
		System.out.println(backspaceCompare("a##c", "#a#c"));
	} 
	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> stackO = new Stack<>();
		Stack<Character> stackS = new Stack<>();
		int cntr = 0;
			while((cntr < s.length()) || (cntr < t.length())) {
				if(cntr < s.length()) {
					if(s.charAt(cntr) != '#') stackO.push(s.charAt(cntr));
					else 
						if(!stackO.isEmpty()) stackO.pop();
				}
				if(cntr < t.length()) {
					if(t.charAt(cntr) != '#') stackS.push(t.charAt(cntr));
					else 
						if(!stackS.isEmpty()) stackS.pop();
				}
				cntr++;
			}
			if(stackO.size() != stackS.size()) return false;
			while(!stackO.isEmpty() && !stackS.isEmpty()) {
				if(stackO.pop() != stackS.pop()) return false;
			}
			return true;
 	}
}
