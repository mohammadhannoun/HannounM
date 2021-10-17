package leetcode.problems;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x= scan.nextInt();
		x= reverse(x);
			System.out.println(x);
				scan.close();
	}
	public static int digits(int x) {
		int cntr= 0;
		while(x!=0) {
			x /=10;
			cntr++;
		}
			return cntr;
	}
	public static int reverse(int x) {
		int cntr= digits(x);
		int[] reverse= new int[cntr];
		int y= 0;
				while(x!=0) {
						reverse[y]= x%10;
					x /= 10;
					y++;
				}
		cntr= cntr-1;
		int i= 0;
		x= 0;
		long q= 0;
			while(cntr>=0) {
				q += reverse[i]*Math.pow(10, cntr);
				x += reverse[i]*Math.pow(10, cntr);
				cntr--;
				i++;
			}
			if(q<Math.pow(-2, 31)||q>(Math.pow(2, 31))-1) {
				x= 0;
				}
					return x;
					
				
	}
}
