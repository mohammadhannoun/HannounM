package leetcode.problems;

public class SubtracTheProductAndSumOfDigitsOfAnInteger {
	 public int subtractProductAndSum(int n) {
	        int prod = 1;
	        int sum = 0;
	        int diff = 0;
	        int dig = 0;
	        while(n != 0){
	            dig = n % 10;
	            n = n / 10;
	            prod *= dig;
	            sum += dig;
	        }
	        return diff = prod - sum;
	    }
}
