package external_exercises;

import java.util.Scanner;

public class ExSixtyTwo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int numOne= scan.nextInt();
		System.out.print("Enter the second integer : ");
		int numTwo= scan.nextInt();
		System.out.print("Enter the third integer : ");
		int numThree= scan.nextInt();
		System.out.print(cond(numOne, numTwo, numThree));
		scan.close();
	}
	public static boolean cond(int x, int y, int z) {
		return (x>=20||y>=20||z>=20)&&(x==Math.abs(y-z)||y==(Math.abs(x-z))||z==(Math.abs(x-y)));
	}
}
