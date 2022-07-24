package leetcode.problems;

public class AddBinaryV1 {
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}
	public static String addBinary(String a, String b) {
		int aL = a.length() - 1, bL = b.length() - 1;
		String res = "";
		char carry = '0';
		while(aL >= 0 && bL >= 0) {
			if(a.charAt(aL) == '0' && b.charAt(bL) == '0') {
				if(carry == '0') {
					res += '0';
				} else {
					res += '1';
					carry = '0';
				}
			} else if((a.charAt(aL) == '1' && b.charAt(bL) == '0') || (a.charAt(aL) == '0' && b.charAt(bL) == '1')) {
				if(carry == '0') {
				res += '1';
				} else {
					if(aL == 0 && bL == 0) {
						res += '0';
						res += '1';
						aL--;
						bL--;
						continue;
					}
					res += '0';
					carry = '1';
				}
			} else {
				if(aL == 0 && bL == 0 && carry == '1') {
					res += '1';
					res += '1';
				} else if(aL == 0 && bL == 0 && carry == '0') {
					res += '0';
					res += '1';
				} else if (carry != '1'){
					res += '0';
					carry = '1';
				} else {
					res += '1';
					carry = '1';
				}
			}
			aL--;
			bL--;
		}
		
		if(aL >= 0) {
			while(aL >= 0) {
				if(a.charAt(aL) == '0') {
					if(carry == '0') {
						res += '0';
					} else {
						res += '1';
						carry = '0';
					}
				} else if(a.charAt(aL) == '1') {
					if(carry == '0') {
						res += '1';
					} else {
						if(aL == 0) {
							res += '0';
							res += '1';
							aL--;
							continue;
						}
						res += '0';
						carry = '1';
					}
				} else {
					res += '0';
					carry = '1';
					if(aL == 0) {
						res += '1';
						res += '1';
					}
				}
				aL--;
			}
		} else if (bL >= 0){
			while(bL >= 0) {
				if(b.charAt(bL) == '0') {
					if(carry == '0') {
						res += '0';
					} else {
						res += '1';
						carry = '0';
					}
				} else if(b.charAt(bL) == '1') {
					if(carry == '0') {
						res += '1';
					} else {
						if(bL == 0) {
							res += '0';
							res += '1';
							bL--;
							continue;
						}
						res += '0';
						carry = '1';
					}
				} else {
					res += '0';
					carry = '1';
					if(bL == 0) {
						res += '1';
						res += '1';
					}
				}
				bL--;
			}
		}
		String rev = "";
		for(int i = res.length() - 1; i >= 0; i--) {
			rev += res.charAt(i);
		}
		return rev;
	}
}
