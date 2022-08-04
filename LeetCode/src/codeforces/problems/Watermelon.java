package codeforces.problems;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		int w = scan.nextInt();
		if(w % 2 != 0 || w == 2) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		scan.close();
	}
	
}
