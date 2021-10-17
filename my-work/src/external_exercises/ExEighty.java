package external_exercises;

import java.util.Scanner;

public class ExEighty {
	public static void main(String[] args) {
	int[] arr= getNumbers();
	for(int i=1; i<=1; i++) {
		if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
			System.out.println(arr[i]);
				}
		else if(arr[i]>arr[i-1]&&arr[i+1]>arr[i]) {
			System.out.println(arr[i+1]);
			}
		else {
			System.out.println(arr[i-1]);
			}
		}
	}
	public static int[] getNumbers() {
		Scanner scan= new Scanner(System.in);
		int[] arr= new int[3];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		return arr;
	}
}
