package external_exercises;

import java.util.Scanner;

public class ExNinetyNine {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
			int len= scan.nextInt();
			int[] arr= new int[len];
				for(int i=0; i<arr.length; i++) {
					System.out.print("Enter the element number "+(i+1)+" : ");
					arr[i]= scan.nextInt();
				}
		System.out.print("Enter the specific number : ");
			int spec= scan.nextInt();
			boolean x= true;
				for(int j=0; j<arr.length-1; j++) {
					if(arr[j]==spec||arr[j+1]==spec) {
						x= true;
					}
					else {
						x= false;
					}
				}
		System.out.print("Every pair of adjacent element contains "+(spec)+" : "+x);
					scan.close();
	}
}
