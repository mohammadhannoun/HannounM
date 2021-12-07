package htu.dsa;

import java.util.Scanner;

public class FibonacciRecursiveSolution {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter the location : ");
		int n = scan.nextInt();
		System.out.println("Fib Of "+ n + " = " + fibSeq(n));
		scan.close();
	}
	public static int fibSeq(int n) {
		if(n <= 1) return n;
		return fibSeq(n - 1) + fibSeq(n - 2);
	}
}
