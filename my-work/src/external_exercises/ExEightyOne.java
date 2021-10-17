package external_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExEightyOne {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array (must be at least one) : ");
		int len= scan.nextInt();
			int[] arr= new int[len];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		int swp= arr[arr.length-1];
		System.out.println("Original array "+Arrays.toString(arr));
		arr[arr.length-1]= arr[0];
		arr[0]= swp;
		System.out.println("New array after swapping : "+Arrays.toString(arr));
		scan.close();
	}
}
