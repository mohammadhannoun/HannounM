package external_exercises;

import java.util.Scanner;

public class ExSixty {
	public static void main(String[] args) {
		System.out.println("Write a setnence : ");
		Scanner scan= new Scanner(System.in);
		String sent= scan.nextLine();
		char[] arr = sent.toCharArray();
		int x=0;
		int y=0;
		
		for(int i=0; i<arr.length; i++) {
			x=i;
		}
		while(arr[x]!=' ') {
			x--;
		}
		y=x-1;
		while(arr[y]!=' ') {
			y--;
		}
		for(int j=(y+1); j<x; j++) {
			System.out.print(arr[j]);
		}
		scan.close();
	}
}
