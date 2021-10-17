package leetcode.problems;

public class RunninSumOf1dArray {
	 public int[] runningSum(int[] nums) {
	      int[] runningSum= new int[nums.length];
	        for(int i= 0; i<nums.length; i++){
	            if(i==0){
	                  runningSum[i] += nums[i];
	            }
	            else{
	            runningSum[i] +=  runningSum[i-1]+nums[i];
	                }
	            }
	        return runningSum;
	    }
}
