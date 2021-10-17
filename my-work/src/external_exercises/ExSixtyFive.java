package external_exercises;

import java.util.Scanner;

public class ExSixtyFive {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1= scan.nextInt();
		System.out.print("Enter the second number : ");
		int num2= scan.nextInt();
		
		int dev= num1/num2;
		int mul= dev*num2;
		int mod= num1-mul;
		
		System.out.println("Mod = "+mod);
		
		scan.close();
	}
}
