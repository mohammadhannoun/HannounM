package leetcode.problems;

public class RelativeRanksV2 {
	 public String[] findRelativeRanks(int[] score) {
		String[] res = new String[score.length];
		int max = -1;
		for(int i : score) max = Math.max(max, i);
		int[] placement = new int[max + 1];
		for(int i = 0; i < placement.length; i++) {
			placement[score[i]] = i + 1;
		}
		int index = 0;
		for(int i = placement.length - 1; i >= 0; i--) {
			if(placement[i] == 0) continue;
			int j = placement[i] - 1;
			switch(index) {
			case 0 :
				res[j] = "Gold Medal";
				break;
			case 1 : 
				res[j] = "Silver Medal";
				break;
			case 2 :
				res[j] = "Bronze Medal";
				break;
			default : 
				res[j] = String.valueOf(index);
				break;
			}
			index++;
		}
		return res;
	 }
}
