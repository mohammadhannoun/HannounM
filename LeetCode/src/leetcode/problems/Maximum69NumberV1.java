package leetcode.problems;

public class Maximum69NumberV1 {
	public int maximum69Number (int num) {
		 // O(n) --> Time
		 // O(n) --> Space
		 String s = String.valueOf(num);
		 char[] arr = s.toCharArray();
		 if(s.indexOf('6') >= 0) {
			 arr[s.indexOf('6')] = '9';
			 s = "";
			 for(int i = 0; i < arr.length; i++) {
				 s += arr[i];
			 }
			 return Integer.parseInt(s);
		 } else {
			 return num;
		 }
	 }
}
