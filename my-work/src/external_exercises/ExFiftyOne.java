package external_exercises;

import java.util.Scanner;

public class ExFiftyOne {
	public static void main(String[] args) {
		System.out.print("Enter the two numbers : ");
		Scanner scan= new Scanner(System.in);
		String numOne= scan.nextLine();
		String numTwo= scan.nextLine();
		
		int numOneV= Integer.parseInt(numOne);
		int numTwoV= Integer.parseInt(numTwo);
		
		int sum = numOneV+numTwoV;
		
		System.out.print("The sum of the two numbers = "+sum);
		
		scan.close();
		
	}
}
