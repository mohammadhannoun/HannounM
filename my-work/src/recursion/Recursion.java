package recursion;

public class Recursion {
	public static String reverseString(String name) {
		if(name=="") {
			return name;
		}
		return reverseString(name.substring(1)) + name.charAt(0);
	}
	public static void main(String[] args) {
		String name= reverseString("Hello");
		System.out.println(name);
	}
}
