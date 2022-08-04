package leetcode.problems;

public class Maximum69NumberV2 {
	 public int maximum69Number (int num) {
		 // O(n) --> Time
		 // O(1) --> Space
		int idx = -1, len = getLength(num), cntr = 0, tmp = num;
			while(num != 0) {
				if(num % 10 == 6) idx =  len - cntr;
				num /= 10;
				cntr++;
			}
			cntr = len;
			len = 0;
			while(cntr > 0) {
				if(cntr != idx) num += (tmp % 10) * Math.pow(10, len);
				else num += 9 * Math.pow(10, len);
				tmp /= 10;
				cntr--;
				len++;
			}
			return num;
		 } public int getLength(int n) {
			 int len = 0;
			 while(n != 0) {
				 len++;
				 n /= 10;
			 }
			 return len;
		 }
}
