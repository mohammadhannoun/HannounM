package leetcode.problems;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharactersV1 {
	 public int lengthOfLongestSubstring(String s) {
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    int start = 0;
		    int max = 0;
		    for(int i = 0; i < s.length(); i++) {
		    	if(map.containsKey(s.charAt(i))) {
		    		map.remove(s.charAt(start), start);
		    		start++;
		    		i--;
		    		continue;
		    	}
		    	map.putIfAbsent(s.charAt(i), i);
		    	max = Math.max(max, map.size());
		    }
		    return max;
		 }
}
