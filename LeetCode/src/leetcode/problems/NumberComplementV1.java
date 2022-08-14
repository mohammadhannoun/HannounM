package leetcode.problems;

import java.util.Stack;

public class NumberComplementV1 {
	public static void main(String[] args) {
		System.out.println(findComplement(1));
		
	}
	 public static int findComplement(int num) {
		 Stack<Integer> binaryStack = new Stack<Integer>();
	      while(num != 0) {
	    	binaryStack.push(num % 2);
	    	num /= 2;
	      }
	      int cntr = binaryStack.size() - 1;
	      int res = 0;
	      while(!binaryStack.isEmpty()) {
	    	  int number = binaryStack.peek();
	    	  binaryStack.pop();
	    	  if(number == 0) {
	    	  res += 1 * Math.pow(2, cntr);
	    	  }
	    	  cntr--;
	      }
	      return res;
	 }
}
