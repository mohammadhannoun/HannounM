package leetcode.problems;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int tmp = Integer.MIN_VALUE, majority = 0;
			for(int i = 0; i < nums.length; i++) {
				if(map.containsKey(nums[i])) map.replace(nums[i], map.get(nums[i]) + 1);
			    else map.put(nums[i], 1);
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getValue() > tmp) {
					tmp = entry.getValue();
					majority = entry.getKey();
				}
			}
			return majority;
	}
}
