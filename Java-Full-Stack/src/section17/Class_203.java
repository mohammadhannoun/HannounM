package section17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class_203 {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("Enter a number : ");
			int number = scan.nextInt();
			System.out.println(number);
		} catch(InputMismatchException e) {
			System.out.println("Wrong data type !!");
		}
		
	}
}
