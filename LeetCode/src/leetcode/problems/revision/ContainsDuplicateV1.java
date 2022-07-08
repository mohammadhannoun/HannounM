package leetcode.problems.revision;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateV1 {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : nums) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) return true;
		}
		return false;
	}
}
