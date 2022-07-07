package leetcode.problems;

public class ImplementStrStrV2 {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","issip"));
	}
	public static int strStr(String haystack, String needle) { 
		if(needle.length() == 0 || (needle.length() == 0 && haystack.length() == 0)) return 0;
		if(haystack.length() == 0 || haystack.length() < needle.length()) return -1;
			if(haystack.contains(needle)) return haystack.indexOf(needle);
			return -1;
	}
}
