package leetcode.problems;

public class SubstringsOfSizeThreeWithDistinctCharacters {
	public static void main(String[] args) {
		String s = "xyzzaz";
		System.out.println(countGoodSubstrings(s));
	}
	
	public static int countGoodSubstrings(String s) {
		if(s.length() < 3) return 0;
		int cntr = 0;
			for(int i = 0; i < s.length() - 2; i++) {
				cntr += (s.charAt(i) != s.charAt(i + 1)) && (s.charAt(i) != s.charAt(i + 2)) && (s.charAt(i + 1) != s.charAt(i + 2)) ? 1 : 0;
			}
			return cntr;
    }
}
