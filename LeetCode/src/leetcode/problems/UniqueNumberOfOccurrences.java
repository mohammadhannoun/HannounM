package leetcode.problems;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class UniqueNumberOfOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		if(arr.length == 1) return true;
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
			for(int i = 0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					map.replace(arr[i], map.get(arr[i]), map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(!set.add(entry.getValue())) return false;
				else set.add(entry.getValue());
			}
			return true;
	}
}
