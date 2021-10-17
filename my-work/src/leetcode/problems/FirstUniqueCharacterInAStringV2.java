package leetcode.problems;

import java.util.Scanner;

public class FirstUniqueCharacterInAStringV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int result = firstUniqChar(s);
		System.out.println(result);
		scan.close();
	}
	public static int firstUniqChar(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				result = i;
				return result;
			}
		}
		return -1;
	}
}	
