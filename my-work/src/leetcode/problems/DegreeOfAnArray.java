package leetcode.problems;
import java.util.HashMap;
import java.util.Map;
public class DegreeOfAnArray {
	public static void main(String[] args) {
		int[] nums = {1,3,2,2,3,1};
		System.out.println(findShortestSubArray(nums));
	}
	public static int findShortestSubArray(int[] nums) {
		if(nums.length == 1) return 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> m = new HashMap<>();
		int left = 0, right = nums.length - 1, tmp = Integer.MAX_VALUE, res = Integer.MAX_VALUE, degree = 0;
			for(int i = 0; i < nums.length; i++) {
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
				if(map.get(nums[i]) > degree) {
					degree = map.get(nums[i]);
				}
			}
				for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
					if(entry.getValue() == degree) {
						m.put(entry.getKey(), entry.getValue());
					}		
				}
				while(!m.isEmpty()) {
					if(m.containsKey(nums[left]) && nums[right] == nums[left]) {
						tmp = right - left + 1;
						m.remove(nums[left]);
						left = 0;
						right = nums.length - 1;
					} else if(m.containsKey(nums[left]) && nums[right] != nums[left]) {
						right--;
					} else {
						left++;
					}
					if(tmp < res) {
						res = tmp;
					}
				}
			return  res;
	}
}