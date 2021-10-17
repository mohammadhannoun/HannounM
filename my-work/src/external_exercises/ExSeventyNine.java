package external_exercises;

import java.util.Arrays;

public class ExSeventyNine {
	public static void main(String[] args) {
		int[] arr= {20, 30, 40};
		System.out.println("Original array : "+Arrays.toString(arr));
		int i= arr[0];
		arr[0]= arr[1];
		arr[1]= arr[2];
		arr[2]= i;
		System.out.println("Rotated array : "+Arrays.toString(arr));
	}
}
