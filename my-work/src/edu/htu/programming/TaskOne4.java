package edu.htu.programming;

import java.util.Scanner;

public class TaskOne4 {

	public static void main(String[] args) {

		Scanner read= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = read.nextInt();
		
		for(int x = num ; x>=1 ; x--) {
			for(int y = 1 ; y<=x ; y++) {
				
				if(y==num) {
				System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println(" ");
		}
		read.close();

	}

}
