package external_exercises;

import java.util.Scanner;

public class ExSixtyV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Write a sentence : ");
		String sen= scan.nextLine();
		String[] spl= sen.split(",", -5);
		for(String a : spl) {
			System.out.println(String.format("\"%s\"", a));
		}
	}
}
