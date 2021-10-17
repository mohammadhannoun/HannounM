package bubble.sort;

import java.util.Arrays;
import java.util.Scanner;

public class W3ResourcesExercise {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
			for(int i= 0; i<arr.length; i++) {
				System.out.println("Enter the element number "+(i+1)+" : ");
				arr[i]= scan.nextInt();
			}
				arr= bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
			scan.close();
	}
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for(int i= arr.length-1; i>=1; i--) {
			for(int j= 0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr;
	}
}
