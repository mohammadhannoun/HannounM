package external_exercises;

import java.util.Scanner;

public class ExSixstyV3 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Write a sentence : ");
		String sen= scan.nextLine();
		String[] spl= sen.split("[ ]+");
		System.out.println(spl[spl.length-2]);
		scan.close();
	}
}
