package edu.htu.programming;
import java.util.Scanner;
public class TaskOne {

	public static void main(String[] args) {
	Scanner read= new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = read.nextInt();
		 for(int x = 0 ; x<num ; x++) {
				System.out.print("* ");				
		}
		 System.out.println(" ");
		 System.out.println("-------- ");
		 for(int y = 0 ; y<num ; y++) {
				System.out.println("*");
		}
		 System.out.println("-------- ");
		 for(int z = 1 ; z<=(num*num) ; z++) {
			System.out.print("* ");
			
			if(z%num==0) {
				System.out.println("");
			
			}
		}
		 System.out.println(" ");

		for(int a = 1 ; a<=num ; a++) {
			for(int b = 1 ; b<=a ; b++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		read.close();

		
	
		
	
		
	}

}
