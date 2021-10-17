package external_exercises;

import java.util.Scanner;

public class ExSixtyFour {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int num1= scan.nextInt();
		System.out.println("Enter the second integer : ");
		int num2= scan.nextInt();
		System.out.print(cond(num1, num2));
		scan.close();
	}
	public static boolean cond(int x, int y) {
	if(x+y<=150) {
		return (x%10==y%10)||(x/10==y/10)||(y%10==x/10)||(y/10==x%10);
		}
	else {
		return false;
		}
	}
}
