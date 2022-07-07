package leetcode.problems;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] s = {""};
		System.out.println(longestCommonPrefix(s));
	}
	public static String longestCommonPrefix(String[] strs) {
		int cntrA = 0, cntrB = strs[0].length(), ind = 0;
			for(int i = 0; i < strs.length; i++){
				cntrA = strs[i].length();
				if(cntrA < cntrB) {
					cntrB = cntrA;
					ind = i;
				}
			}
			String chk = strs[ind], res = "";
			cntrA = 0; cntrB = 0; int temp = cntrB;
				while(cntrB != chk.length()) {
					if(strs[cntrA].charAt(cntrB) == chk.charAt(cntrB)) 	cntrA++;
					else return res;
					if(cntrA == strs.length) {
						res += chk.charAt(cntrB);
						cntrB = temp + 1;
						temp++;
						cntrA = 0;
					} 
				}
			return res;
	}	
}
