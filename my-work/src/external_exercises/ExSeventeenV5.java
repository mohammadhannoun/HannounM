package external_exercises;

import java.util.Scanner;

public class ExSeventeenV5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1=new int[2];
		int[] arr2=new int[2];
		System.out.print("Enter the first binary number : ");
		for(int x=0; x<2; x++) {
		arr1[x]=scan.nextInt();
		System.out.println(arr1[x]);
		}
		System.out.print("Enter the second binary number : ");
		for(int y=0; y<2; y++) {
			arr2[y]=scan.nextInt();
		}
		
		
	}
}
