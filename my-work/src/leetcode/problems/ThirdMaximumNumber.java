package leetcode.problems;
import java.util.HashMap;
public class ThirdMaximumNumber {
	//NOT FINISHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		int[] nums = {1,2,2,5,3,5};
		System.out.println(thirdMax(nums));
	} 
	public static int thirdMax(int[] nums) {
		if(nums.length == 1) return nums[0]; 
		HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i = 0;i < nums.length; i++) {
			 if(map.containsKey(nums[i])) {
				 map.replace(nums[i], map.get(nums[i]), map.get(nums[i]) + 1);
			 } else {
				 map.put(nums[i], 1);
			 }
		 }
		 if(map.size() == 1) {
			 return nums[0];
		 } else if(map.size() == 2) {
			 int first = nums[0];
			 int sec = 0;
			 	for(int num : nums) {
			 		if(num != first) {
			 			sec = num;
			 			break;
			 		}
			 	}
			 	return Math.max(first, sec);
		 } else {
			 int first = nums[0];
			 int sec = 0;
			 int third = 0;
			 int cntr = 0;
			 	for(int num : nums) {
			 		if(num != first) {
			 			sec = num;
			 			cntr++;
			 			break;
			 		}
			 		cntr++;
			 	}
			 	for(int i = cntr; i < nums.length; i++) {
			 		if(nums[i] != sec) {
			 			third = nums[i];
			 			break;
			 		}
			 	}
			 	if(first < sec && first < third) {
			 		return first;
			 	} else if(sec < first && sec < third) {
			 		return sec;
			 	} else {
			 		return third;
			 	}
		 }
		 
		 
  }
}
