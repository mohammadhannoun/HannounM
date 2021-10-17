package leetcode.problems;

import java.util.Scanner;

public class FirstUniqueCharacterInAStringV4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int result = firstUniqChar(s);
		System.out.println(result);
		scan.close();
	}
	public static int firstUniqChar(String s) {
		char[] arr = new char[26];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)-'a'] == 1) {
				return s.indexOf(s.charAt(i));
			}
		}
		return -1;
	}
}
