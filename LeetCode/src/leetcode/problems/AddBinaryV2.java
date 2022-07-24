package leetcode.problems;

public class AddBinaryV2 {
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}
	public static String addBinary(String a, String b) {
		StringBuilder s = new StringBuilder();
		int aInd = a.length() - 1, bInd = b.length() - 1;
		boolean carry = false;
		
		while(aInd >= 0 || bInd >= 0) {
			char aBit = aInd >= 0 ? a.charAt(aInd) : '0';
			char bBit = bInd >= 0 ? b.charAt(bInd) : '0';
				if(aBit == '0' && bBit == '0') {
					if(carry) {
						s.append('1');
						carry = false;
					}
					else s.append('0');
				} else if(aBit != bBit) {
					if(carry) {
						s.append('0');
						carry = true;
					} else {
						s.append('1');
					}
				} else {
					if(carry) {
						s.append('1');
					} else { 
						s.append('0');
					}
					carry = true;
				}
            aInd--;
            bInd--;
		}
		if(carry) {
			s.append('1');
		}
		s = s.reverse();
		return s.toString();
	}
}
