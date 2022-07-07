package leetcode.problems;

public class MergeSortedArraysV2 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		int len= nums1.length-1;
			while(m>=0 || n>=0) {
				int numsOneValue= m>=0? nums1[m]: Integer.MIN_VALUE;
				int numsTwoValue= n>=0 ? nums2[n]: Integer.MIN_VALUE;
				
				if(numsOneValue>numsTwoValue) {
					nums1[len--]= numsOneValue;
					m--;
				}
				else {
					nums1[len--]= numsTwoValue;
					n--;
				}
			}
	}
}
