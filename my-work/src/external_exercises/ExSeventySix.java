package external_exercises;

import java.util.Scanner;

public class ExSeventySix {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the length of array no.1 : ");
		int len1= scan.nextInt();
		System.out.print("Enter the length of array no.2 : ");
		int len2= scan.nextInt();
		int[] arr1= new int[len1];
		int[] arr2= new int[len2];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print("Enter the element number "+(i+1)+" of the first array : ");
			arr1[i]= scan.nextInt();
		}
		for(int j=0; j<arr2.length; j++) {
			System.out.print("Enter the element number "+(j+1)+" of the second array : ");
			arr2[j]= scan.nextInt();
		}
		if(arr1[0]==arr2[0]&&arr1[len1-1]==arr2[len2-1]) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		scan.close();
	}
}
