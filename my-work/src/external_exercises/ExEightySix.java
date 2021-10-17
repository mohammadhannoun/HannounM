package external_exercises;

import java.util.Scanner;

public class ExEightySix {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of (n) : ");
		int n= scan.nextInt();
		while(n!=1) {
			if(n%2==0) {
				n= n/2;
				System.out.println(n);
			}
			else {
				n= (n*3)+1;
				System.out.println(n);
			}
		}
		scan.close();
	}
}
