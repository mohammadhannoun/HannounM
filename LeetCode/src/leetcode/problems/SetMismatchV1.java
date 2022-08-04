package leetcode.problems;
import java.util.HashSet;
public class SetMismatchV1 {
	public int[] findErrorNums(int[] nums) {
		 //Filling a hashset with the numbers from 1 to n
		 HashSet<Integer> ordered = new HashSet<Integer>();
		 	for(int i = 1; i <= nums.length; i++) {
		 		ordered.add(i);
		 	}
		//Finding the duplicate number
		 HashSet<Integer> duplicate = new HashSet<Integer>();
		 int duplicateNumber = 0;
			 for(int i = 0; i < nums.length; i++) {
				 if(!duplicate.add(nums[i])) {
					 duplicateNumber = nums[i];
					 continue;
				 } 
				 ordered.remove(nums[i]);
		 }
		 //End of finding the duplicate number
			 for(int i : ordered) {
				 return new int[] {duplicateNumber, i};
			 }
		 return null;
	 }
}
