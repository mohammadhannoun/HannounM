package leetcode.problems;

public class ReverseWordsInAStringIIIV1 {
	public String reverseWords(String s) {
		String[] res = s.split(" ");
	    StringBuilder result = new StringBuilder();
	    for(int i = 0; i < res.length; i++) {
	    	for(int j = res[i].length() - 1; j >= 0; j--) {
	    		result.append(res[i].charAt(j));
	    	}
	    	if(i != res.length - 1) {
	    		result.append(" ");
	    	}
	    }
	    return result.toString();
    }
}
