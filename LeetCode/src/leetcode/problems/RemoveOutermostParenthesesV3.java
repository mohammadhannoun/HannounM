package leetcode.problems;

public class RemoveOutermostParenthesesV3 {
	public static void main(String[] args) {
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));
	} 
	public static String removeOuterParentheses(String s) {
		StringBuilder st = new StringBuilder();
		int cntr = 0;
			for(char c : s.toCharArray()) {
				if(c == '(' && cntr++ > 0) st.append(c);
				if(c == ')' && cntr-- > 1) st.append(c);
				System.out.println(cntr);
			}
			return st.toString();
	}
}
