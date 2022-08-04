package leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanksV1 {
	 public String[] findRelativeRanks(int[] score) {
		  String[] res = new String[score.length];
		  for(int i = 0; i < score.length; i++) {
			  res[i] = String.valueOf(score[i]);
		  }
		  Arrays.sort(score);
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  int cntr = 1;
		  for(int i = score.length - 1; i >= 0; i--) {
			  map.put(score[i], cntr);
			  cntr++;
		  }
		  for(int i = 0; i < res.length; i++) {
			  if(map.get(Integer.parseInt(res[i])) == 1){
				  res[i] = "Gold Medal";
			  } else if(map.get(Integer.parseInt(res[i])) == 2) {
				  res[i] = "Silver Medal";
			  } else if(map.get(Integer.parseInt(res[i])) == 3) {
				  res[i] = "Bronze Medal";
			  } else {
			  res[i] = String.valueOf(map.get(Integer.parseInt(res[i])));
			  }
		}
		  return res;
	 } 
}
