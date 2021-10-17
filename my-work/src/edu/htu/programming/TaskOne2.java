package edu.htu.programming;
import java.util.Scanner;
public class TaskOne2 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = read.nextInt();
	int r = 1;
	for(int i = 1 ; i<=num ; i++ ) {
		
		for(int x = (num-r) ; x>=1 ; x--) {
			System.out.print(" ");
		}
		for(int z = 1 ; z<=i ; z++) {
			System.out.print("*");
		}
		System.out.println(" ");
		r++;
	}
	
		read.close();
	}

}
