package leetcode.problems.revision;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberV1 {
	//O(n) for both time and space
	 public int singleNumber(int[] nums) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	for(int i : nums) {
	    		if(!map.containsKey(i)) map.put(i, 1);
	    		else map.put(i, (map.get(i) + 1));
	    	}
	    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    	if(entry.getValue() == 1) return entry.getKey();
	    }
	    return 0;
	 }
}
