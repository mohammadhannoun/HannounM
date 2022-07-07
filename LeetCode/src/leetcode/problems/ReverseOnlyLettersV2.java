package leetcode.problems;
import java.util.Stack;
public class ReverseOnlyLettersV2 {
	public static String reverseOnlyLetters(String s) {
		Stack<Character> letters = new Stack<>();
			
			for(int i = 0; i < s.length(); i++) {
				if(Character.isLetter(s.charAt(i))) {
					letters.push(s.charAt(i));
				}
			}
			StringBuilder rev = new StringBuilder();
				for(int j = 0; j < s.length(); j++) {
					if(Character.isLetter(s.charAt(j))){
						rev.append(letters.pop());
					} else {
						rev.append(s.charAt(j));
					}
				}
		return rev.toString();		
	}
	public static void main(String[] args) {
		String s = "dd-pp--aa";
		  s = reverseOnlyLetters(s);
		  System.out.println(s);
	}
}
