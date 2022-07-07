package leetcode.problems;

public class NumberOfStepsToReduceANumberToZero {
	 public int numberOfSteps(int num) {
	        int cntr = 0; 
	        while(num != 0){
	            if(num % 2 == 0){
	                num /= 2;
	            }
	            else{
	                num -= 1;
	            }
	         cntr++;
	        }
	        return cntr;
	    }
}
