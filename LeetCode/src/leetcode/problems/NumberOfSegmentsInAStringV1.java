package leetcode.problems;

public class NumberOfSegmentsInAStringV1 {
	
	 public int countSegments(String s) {
	        s = s.trim();
	        if(s.length() == 0) return 0;
	        boolean f = false;
	        int numberOfSpaces = 1;
	        for(int i = 0; i < s.length(); i++) {
	        	if(s.charAt(i) == ' ' && f) {
	        		numberOfSpaces++;
	        		f = false;
	        	} else if(s.charAt(i) != ' ') {
	        		f = true;
	        	}
	        }
	        return numberOfSpaces;
	    }
}
