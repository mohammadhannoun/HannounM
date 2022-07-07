package leetcode.problems;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInAStringV3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int result = firstUniqChar(s);
		System.out.println(result);
		scan.close();
	}
	public static int firstUniqChar(String s) {
		HashMap<Character , Integer> values = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(values.containsKey(s.charAt(i))) {
				values.put(s.charAt(i), values.get(s.charAt(i))+1);
			}
			else {
				values.put(s.charAt(i), 1);
			}
		}
		for(int j= 0; j < s.length(); j++) {
			if(values.get(s.charAt(j)) == 1){
				return s.indexOf(s.charAt(j));
			}
		}
		return -1;
	}
}
