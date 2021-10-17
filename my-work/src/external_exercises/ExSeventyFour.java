package external_exercises;

import java.util.Scanner;

public class ExSeventyFour {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		if(arr[0]==10||arr[arr.length-1]==10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		scan.close();
	}
}
