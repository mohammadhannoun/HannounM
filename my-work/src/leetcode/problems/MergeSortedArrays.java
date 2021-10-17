package leetcode.problems;

public class MergeSortedArrays {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int count= m+n-1;
		m--;
		n--;
			while(m>=0&&n>=0) {
				if(nums1[m]>nums2[n]) {
					nums1[count--]= nums1[m--];
				}
				else {
					nums1[count--]= nums2[n--];
				}
			}
			while(n>=0) {
				nums1[count--]= nums2[n--];
			}
	}
}
