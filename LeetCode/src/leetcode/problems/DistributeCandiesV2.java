package leetcode.problems;

import java.util.HashSet;

public class DistributeCandiesV2 {
		 public int distributeCandies(int[] candyType) {
		        HashSet<Integer> setOfTypes = new HashSet<Integer>();
		        int canBeEaten = 0;
		        for(int i : candyType){
		            if(setOfTypes.add(i) && canBeEaten < candyType.length / 2){
		                canBeEaten++;
		                if(canBeEaten == candyType.length / 2) break;
		            }
		        }
		        return canBeEaten;
		    }
	 }

