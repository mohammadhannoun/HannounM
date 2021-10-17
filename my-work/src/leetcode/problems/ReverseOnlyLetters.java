package leetcode.problems;
import java.util.Stack;
public class ReverseOnlyLetters {
	  public static String reverseOnlyLetters(String s) {
		    Stack<Integer> ind = new Stack<>();
		    Stack<Character> letters = new Stack<>();
		    Stack<Character> others = new Stack<>();
		        for(int i =0; i < s.length(); i++){
		            if(Character.isLetter(s.charAt(i))) {
		            	letters.push(s.charAt(i));
		            	}
		            else {
		            	others.push(s.charAt(i));
		            	ind.push(i);
		            }
		        }
		        int cntr = 0;
		        String rev = "";
		        while(cntr < s.length()) {
		        	if(!ind.isEmpty() && cntr == ind.firstElement()) {
		        		rev += others.firstElement();
		        		ind.remove(0);
		        		others.remove(0);
		        	}
		        	else {
		        		rev += letters.peek();
		        		letters.pop();
		        	}
		        	cntr++;
		        }
		        return rev;
	}
	  public static void main(String[] args) {
		  String s = "Test1ng-Leet=-code-Q!";
		  s = reverseOnlyLetters(s);
		  System.out.println(s);
		  
	  }
}
