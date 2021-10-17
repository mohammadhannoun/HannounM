package external_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExNinetyTwo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		int even= 0;
		int odd= 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Original array : "+Arrays.toString(arr));
		System.out.println("Number of even elements = "+even);
		System.out.println("Number of odd elements = "+odd);
			scan.close();
	}
}
