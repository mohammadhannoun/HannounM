package leetcode.problems;

import java.util.HashMap;

public class FindTheDifferenceV1 {
	public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char res = ' ';
        for(char c : s.toCharArray()) {
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c) + 1);
        	} else { 
        		map.put(c, 1);
        	}
        }
        int cntr = 0;
        while(cntr != t.length()) {
        	if(!map.containsKey(t.charAt(cntr))) {
        		res = t.charAt(cntr);
        		break;
        	} else if(map.get(t.charAt(cntr)) == 1) {
        		map.remove(t.charAt(cntr)); 
        	} else if (map.get(t.charAt(cntr)) > 1) {
        		map.put(t.charAt(cntr), map.get(t.charAt(cntr)) - 1);
        	}
        	cntr++;
        }
        return res;
    }
}
