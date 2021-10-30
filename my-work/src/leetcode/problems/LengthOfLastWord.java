package leetcode.problems;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s =   "luffy is still joyboy";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
		int cntr = 0, len = 0;
     	for(int i = s.length() - 1; i >= 0; i--) {
     		if(Character.isLetter(s.charAt(i))) break; 
     		else cntr++;	
     	}
     	for(int j = (s.length() - 1) - cntr; j >= 0; j--) {
     		if(Character.isLetter(s.charAt(j)))	len++;
     		 else break;
     	}
     	return len;
	    }
}
