package leetcode.problems;

public class NumberOfGoodPairs {
	 public int numIdenticalPairs(int[] nums) {
	        int cntr = 0;
	        for(int i = 0; i < nums.length; i++){
	            for(int j = 0; j < i; j++){
	                if(nums[i]==nums[j]){
	                    cntr++;
	                }
	            }
	        }
	        return cntr;
	    }
}
