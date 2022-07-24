package leetcode.problems;

import java.util.Arrays;

public class HeightChecker {
	  public int heightChecker(int[] heights) {
	        int[] expected = new int[heights.length];
	        int cntr = 0;
	        for(int i : heights){
	            expected[cntr] = i;
	            cntr++;
	        }
	        Arrays.sort(expected);
	        cntr = 0;
	        for(int i = 0; i < heights.length; i++){
	            if(expected[i] != heights[i]) cntr++;
	        }
	        return cntr;
	    }
}
