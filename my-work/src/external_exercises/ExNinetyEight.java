package external_exercises;

import java.util.Scanner;

public class ExNinetyEight {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the length of the array : ");
	int len= scan.nextInt();
	int[] arr= new int[len];
	int counter= 0;
	boolean x= false;
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
			if(arr[i]==20) {
				counter++;
					if(counter==3) {
					x= true;	
					}
			}
			if(i==arr.length-1) {
					for(int j=0; j<arr.length-1; j++) {
						if(arr[j]==20&&arr[j+1]==20) {
							x= false;
						}
					}
			}
		}
		System.out.println(String.valueOf(x));
	}
}
