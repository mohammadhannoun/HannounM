package external_exercises;

import java.util.Scanner;

public class ExSeventyEight {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[] arr= new int[2];
		System.out.print("Enter element number 1 : ");
		arr[0]= scan.nextInt();
		System.out.print("Enter element number 2 : ");
		arr[1]= scan.nextInt();
		if(arr[0]==4||arr[0]==7||arr[1]==4||arr[1]==7) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		scan.close();
	}
}
