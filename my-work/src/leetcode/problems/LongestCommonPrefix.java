package leetcode.problems;
import java.util.Stack;
public class LongestCommonPrefix {
	
	
	
	
	
	
	
		public String longestCommonPrefix(String[] strs) {
			if(strs.length == 1) {
				return strs[0];
			}
			String str = "";
			int ind = 0;
			int at = 0;
			int size = 0;
			int num = 0;
			if(strs[0].length() > 1) {
				while(strs[ind].charAt(at) == strs[0].charAt(at)) {
					if(ind == strs.length - 1) {
						str += strs[0].charAt(at);
						ind = 1;
						at = at + 1;
					}
					ind++;
				}	
			}
				return str;
		}	
}
