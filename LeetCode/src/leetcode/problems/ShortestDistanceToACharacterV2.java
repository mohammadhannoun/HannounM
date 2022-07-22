package leetcode.problems;

public class ShortestDistanceToACharacterV2 {
	  public int[] shortestToChar(String s, char c) {
		  int[] res = new int[s.length()];
		    int numberOfC = 0, distance = 0;
		    for(int i = 0; i < s.length(); i++) {
		    	if(s.charAt(i) == c) {
		    		numberOfC++;
		    	}
		    }
		    for(int j = 0; j < s.length(); j++) {
		    	distance = Math.abs(s.indexOf(c) - j);
		    	res[j] = distance;
		    	if(numberOfC > 1 && distance == 0) {
		    		s = s.substring(j + 1);
		    	}
		    }
		    return res;
	  }
}
