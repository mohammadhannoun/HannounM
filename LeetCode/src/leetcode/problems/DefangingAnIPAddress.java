package leetcode.problems;

public class DefangingAnIPAddress {
	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
	   public static String defangIPaddr(String address) {
	        String res = "";
			 for(int i = 0; i < address.length(); i++) {
				 res += address.charAt(i) == '.' ? "[.]" : address.charAt(i);
			 }
			 return res;
	    }
}
