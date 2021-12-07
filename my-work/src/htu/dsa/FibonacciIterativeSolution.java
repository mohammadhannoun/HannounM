package htu.dsa;
import java.util.Scanner;
public class FibonacciIterativeSolution {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter the location : ");
		int n = scan.nextInt();
		System.out.println("Fib Of "+ n + " = " + fibSeq(n));
		scan.close();
	}
	public static int fibSeq(int n) {
		if(n <= 1) return n;
		int slow = 0;
		int fast = 1;
		int result = (slow + fast);
			for(int i = 2; i < n; i++) {
				slow = fast;
				fast = result;
				result = (slow + fast);
			}
			return result;
	}
}
