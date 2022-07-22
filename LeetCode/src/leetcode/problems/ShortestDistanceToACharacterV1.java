package leetcode.problems;

public class ShortestDistanceToACharacterV1 {
	 
	   public int[] shortestToChar(String s, char c) {
		   int[] res = new int[s.length()];
		   int cntr = 0;
		   for(int i = 0; i < s.length(); i++) {
			   if(s.charAt(i) == c) cntr++;
		   }
		   int[] indecies = new int[cntr];
		   cntr = 0;
		   for(int i = 0; i < s.length(); i++) {
			   if(s.charAt(i) == c) {
				   indecies[cntr] = i;
				   cntr++;
			   }
		   }
		   for(int j = 0; j < s.length(); j++) {
			   int min = Integer.MAX_VALUE;
			   for(int k = 0; k < indecies.length; k++) {
				   min = Math.min(min, Math.abs((indecies[k] - j)));
			   }
			   res[j] = min;
		   }
		   return res;
	   }
}
