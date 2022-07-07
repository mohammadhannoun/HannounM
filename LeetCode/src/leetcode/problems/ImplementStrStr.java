package leetcode.problems;
import java.util.HashSet;
public class ImplementStrStr {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","issip"));
	}
	public static int strStr(String haystack, String needle) { 
		if(needle.isEmpty() || (needle.isEmpty() && haystack.isEmpty()) || (haystack.length() == 1 && needle.length() == 1 && needle.charAt(0) == haystack.charAt(0))) return 0;
		if(haystack.isEmpty() || haystack.length() < needle.length()) return -1;
		HashSet<String> set = new HashSet<>();
			set.add(needle);
			for(int i = 0; i < (haystack.length() - needle.length()); i++) {
				if(set.contains(haystack.substring(i, (needle.length()+i)))) return haystack.indexOf(needle);
			}
			return -1;
	}
}
