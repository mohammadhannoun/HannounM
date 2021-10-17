package external_exercises;

import java.util.Scanner;

public class ExFiftyTwo {
	public static void main(String[] args) {
		int numOne= getNumber("FIRST");
		int numTwo= getNumber("SECOND");
		int numThree= getNumber("Third");
		if(numThree==(numOne+numTwo)||(numOne+numThree)==numTwo||(numTwo+numThree)==numOne) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	public static int getNumber(String nom) {
		System.out.println("Enter the "+nom+" integer : ");
		Scanner scan= new Scanner(System.in);
		int num= scan.nextInt();
		return num;
	}
	
}
