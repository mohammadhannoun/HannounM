package leetcode.problems;

public class FindTheDifferenceV2 {
	public char findTheDifference(String s, String t) {
		char[] sAr = s.toCharArray();
		char[] tAr = t.toCharArray();
		char c = 0;
		for(char ch : sAr) c ^= ch;
		for(char ch : tAr) c ^= ch;
		return c;
	}
}
