package leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayV1 {
	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	} 
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		  Arrays.sort(nums); 
			 List<Integer> list = new LinkedList<Integer>();
			 HashSet<Integer> set = new HashSet<Integer>();
			 for(int i : nums) {
				 set.add(i);
			 }
			 int min = nums.length - (nums.length - 1);
			 int max = nums.length;
			 while(min <= max) {
				 if(!set.contains(min)) {
					 list.add(min);
				 }
				 min++;
			 }
			 return list;
	}
}
