package external_exercises;

import java.util.Scanner;

public class ExFourtyNine {
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner in= new Scanner(System.in);
		int numTwo= in.nextInt();
		if(numTwo % 2==0) {
			System.out.println("1");
		}
		else if(numTwo % 2 != 0) {
			System.out.println("0");
		}
		in.close();
	}
}
