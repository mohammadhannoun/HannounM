package external_exercises;

import java.util.Scanner;

public class ExSixtyOne {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Write a word : ");
		String word= scan.nextLine();
		char[] wrd= word.toCharArray();
		for(int i= (wrd.length-1); i>=0; i--) {
			System.out.print(wrd[i]);
		}
		scan.close();
	}
}
