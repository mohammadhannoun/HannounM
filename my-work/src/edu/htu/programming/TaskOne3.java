package edu.htu.programming;

import java.util.Scanner;

public class TaskOne3 {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = read.nextInt();
		
		for(int x = 1 ; x<=num ; x++) {
			for(int y = 1 ; y<=num ; y++) {
				if(y==x) {
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
