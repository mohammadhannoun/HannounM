package leetcode.problems;

import java.util.HashSet;

public class NRepeatedElementInSize2NArray {
	 public int repeatedNTimes(int[] nums) {
		    HashSet<Integer> set = new HashSet<Integer>();
		        for(int i : nums){
		            if(!set.add(i)){
		                return i;
		            }
		        }
		        return 0;
		    }
}
