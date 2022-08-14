package leetcode.problems;

import java.util.HashSet;

public class DistributeCandiesV1 {
	 public int distributeCandies(int[] candyType) {
	        HashSet<Integer> setOfTypes = new HashSet<Integer>();
	        int maximum = candyType.length / 2;
	        int canBeEaten = 0;
	        for(int i : candyType){
	            if(setOfTypes.add(i) && canBeEaten < maximum){
	                canBeEaten++;
	                if(canBeEaten == maximum) break;
	            }
	        }
	        return canBeEaten;
	    }
}
