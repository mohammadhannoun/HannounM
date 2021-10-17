package bubble.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRevision {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
			for(int i= 0; i<arr.length; i++) {
				System.out.print("Enter the element number "+(i+1)+" : ");
				arr[i]= scan.nextInt();
			}
			arr= bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
			scan.close();
	}
	public static int[] bubbleSort(int[] arr) {
		int temp= 0;
		boolean swp= false;
		for(int i= arr.length-1; i>=1; i--) {
				swp= false;
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swp= true;
				}
			}
		}
		return arr;
	}
}
