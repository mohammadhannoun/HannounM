package leetcode.problems;
import java.util.Scanner;
public class ReverseIntegerV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x= scan.nextInt();
		x= reverse(x);
			System.out.print(x);
		scan.close();
	}
	
	
	
	public static int reverse(int x) {
		long rev= 0;
			while(x!=0) {
				rev= rev*10 + x%10;
				x /= 10;
			}
			
			if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) {
				return 0;
			}
			
			else {
				return (int)rev;
			}
	}
}
