package leetcode.problems;

import java.util.Stack;

public class NumberComplementV2 {
	public static void main(String[] args) {
		System.out.println(findComplement(5));
		
	}
	 public static int findComplement(int num) {
		 int cntr = 0, res = 0;
	      while(num != 0) {
	    	res += num % 2 == 1 ? 0 : 1 * Math.pow(2, cntr);
	    	num /= 2;
	    	cntr++;
	      }  
	      return res;
	 }
}
