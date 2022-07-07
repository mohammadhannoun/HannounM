package leetcode.problems;
import java.util.Set;
import java.util.HashSet;
public class ContainsDuplicatesII {
	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i])) {
				return true;
			}
			if(set.size() > k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}
}
