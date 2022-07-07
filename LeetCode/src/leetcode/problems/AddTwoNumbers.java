package leetcode.problems;

import java.math.BigInteger;

public class AddTwoNumbers {
	public static void main(String[] args) {
		
	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			
			BigInteger fNumber = getInt(l1), sNumber = getInt(l2);
			
			BigInteger sum = fNumber;
			sum.add(sNumber);
			
			ListNode result = new ListNode(1);
	        ListNode ret = result;
			if(sum.intValue() == 0){
	            return new ListNode(0);
	        }
			while(sum.intValue() != 0) {
	            ListNode next = new ListNode((sum.remainder(BigInteger.valueOf(10)).intValue()));
	            result.next = next;
	            result = result.next;
				sum.divide(BigInteger.valueOf(10));
			}
			return ret.next;
			
		} public BigInteger getInt(ListNode list) {
			String result = "";
			while(list != null) {
				result += list.val;
				list = list.next;
			}
			String flip = "";
			for(int i = result.length()-1; i >= 0; i--) {
				flip += result.charAt(i);
			}
			BigInteger number = new BigInteger(flip);
			return number;
		}
}
