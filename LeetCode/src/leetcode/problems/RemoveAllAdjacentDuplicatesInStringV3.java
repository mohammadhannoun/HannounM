package leetcode.problems;

public class RemoveAllAdjacentDuplicatesInStringV3 {
	 public String removeDuplicates(String s) {
		int i = 0;
		char[] res = s.toCharArray();
		for(int j = 0; j < s.length(); j++, i++) {
			res[i] = res[j];
				if(i > 0 && res[i] == res[i - 1]) {
					i -= 2;
				}
		}
		return new String(res, 0, i);
	 }
}
