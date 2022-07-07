package leetcode.problems;
import java.util.Arrays;
public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int leftPointer, rightPointer;
		leftPointer= rightPointer= 0;
		int swp= nums1[leftPointer];
		
		while(leftPointer<m+n) {
			if(leftPointer<m+n&&rightPointer<n&&swp!=0) {
				if(swp<nums2[rightPointer]) {
					nums1[leftPointer]= swp;
					leftPointer++;
					swp= nums1[leftPointer];
				}
				else {
					nums1[leftPointer]= nums2[rightPointer];
					leftPointer++;
					rightPointer++;
				}
			}
			else if(leftPointer<m+n&&swp!=0) {
				nums1[leftPointer]= swp;
				leftPointer++;
				swp= nums1[leftPointer];
			}
			else if(rightPointer<n) {
				nums1[leftPointer]= nums2[rightPointer];
				leftPointer++;
				rightPointer++;
			}
		}
		System.out.print(Arrays.toString(nums1));
	}
	public static void main(String[] args) {
		int[] nums1= {1, 2, 3, 0, 0, 0}; 
		int[] nums2= {4, 5, 6};
		int m= 3;
		int n= 3;
		merge(nums1, m, nums2, n);
	}
}
