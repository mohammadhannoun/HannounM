package leetcode.problems;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Entert a number : ");
		int x= scan.nextInt();
		boolean b= isPalindrome(x);
		System.out.println(b);
		scan.close();
	}
	public static boolean isPalindrome(int x) {
			int temp= x;
			int rev= 0;
			while(x!=0) {
				rev= rev*10 + x%10;
				x /=10;
			}
				return (temp==rev&&rev>=0);
	}
}
