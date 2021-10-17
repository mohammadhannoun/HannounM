package leetcode.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		print("Enter the length of the array : ");
		int len= scan.nextInt();
		print("Enter the target number : ");
		int target= scan.nextInt();
		int[] arr= new int[len];
			for(int i=0; i<arr.length; i++) {
				print("Enter the element number "+(i+1)+" : ");
				arr[i]= scan.nextInt();
			}
		int[] index= new int[2];
		index= twoSum(arr, target);
		
		print(Arrays.toString(index));
	}
public static int[] twoSum(int[] x, int target) {
	int[] twoSum= new int[2];
	for(int i=0; i<x.length; i++) {
			for(int j=0; j<x.length; j++) {
				if(x[i]+x[j]==target&&i!=j) {
					twoSum[0]=i;
					twoSum[1]=j;
				}
			}
		}
	return twoSum;
	}
public static void print(String a) {
	System.out.println(a);
}
}
