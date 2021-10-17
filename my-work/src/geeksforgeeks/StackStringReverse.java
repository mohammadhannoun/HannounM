package geeksforgeeks;

public class StackStringReverse {
	public static void main(String[] args) {
		String S = reverse("GeeksforGeeks");
		System.out.println(S);
	}
	public static String reverse(String S) {
		if(S == "") {
			return ""; 
		}
			return reverse(S.substring(1)) + S.charAt(0);
	}
}
