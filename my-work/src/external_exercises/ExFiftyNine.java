package external_exercises;

import java.util.Scanner;

public class ExFiftyNine {
	public static void main(String[] args) {
		System.out.println("Write : ");
		Scanner scan= new Scanner(System.in);
		String sent= scan.nextLine();
		sent= sent.toLowerCase();
		System.out.print(sent);
		scan.close();
	}
}
